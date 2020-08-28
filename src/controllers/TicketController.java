package controllers;


import dao.ClientDao;
import dao.ProductDao;
import dao.TicketDao;
import dao.VehicleDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import models.Client;
import models.Product;
import models.Ticket;
import models.Vehicle;
import utils.NumberField;
import utils.Utils;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class TicketController implements Initializable, Utils {

    private ClientDao clientDao;
    private ProductDao productDao;
    private TicketDao ticketDao;
    private VehicleDao vehicleDao;

    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnConfirmar;
    @FXML
    private ComboBox<String> comboCliente;
    @FXML
    private ChoiceBox<String> choiseProducto;
    @FXML
    private ComboBox<String> comboPatente;
    @FXML
    private NumberField txtBruto;
    @FXML
    private NumberField txtTara;
    @FXML
    private NumberField txtNeto;
    @FXML
    private Label labNroTicket;
    @FXML
    private Label labFechaHora;

    public TicketController(){
        this.clientDao = new ClientDao();
        this.productDao = new ProductDao();
        this.ticketDao = new TicketDao();
        this.vehicleDao = new VehicleDao();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        initFields();
    }

    /** Events **/

    // Seleccionar cliente
    public void selectClientEvent(ActionEvent actionEvent) {
        this.comboPatente.setItems(FXCollections.observableArrayList());    // Limpio la lista para que se actualice
        Optional.ofNullable(this.comboCliente.getValue()).orElseThrow(RuntimeException::new);
        List<Vehicle> vehicleList = this.clientDao.getByName(this.comboCliente.getValue()).getVehicles();   // Traigo la lista de vehiculos del cliente seleccionado
        if (vehicleList != null){
            for (Vehicle v : vehicleList) {
                this.comboPatente.getItems().add(v.getPatent());    //  Si tiene vehiculos agrego las patentes
            }
        }
    }

    // Seleccionar patente
    public void selectVehicleEvent(ActionEvent actionEvent) {
        Optional.ofNullable(this.comboPatente.getValue()).orElseThrow(RuntimeException::new);
        Vehicle v = this.vehicleDao.getByPatent(this.comboPatente.getValue());
        if (v != null){
            this.txtTara.setText(Float.toString(v.getTara()));
        }
        calculateNetValue();
    }

    // Calcular neto event
    public void calculateNetEvent(KeyEvent keyEvent) {
        if (this.txtTara.getText().equals("")){
            this.txtTara.setText(Float.toString(0));
        }
        if (this.txtBruto.getText().equals("")){
            this.txtBruto.setText(Float.toString(0));
        }
        calculateNetValue();
    }

    // Refresh button
    public void refreshFieldsEvent(MouseEvent mouseEvent) {
        clearFields();
        this.comboPatente.setValue(null);
        this.comboCliente.setValue(null);
        this.txtTara.setText(Float.toString(0));
        this.txtNeto.setText(Float.toString(0));
    }

    // Confirmar
    public void btnConfirmarEvent(MouseEvent mouseEvent) {
        disableFields();
        this.ticketDao.add(
                new Ticket(this.labFechaHora.getText(),
                        Float.parseFloat(this.txtBruto.getText()),
                        Float.parseFloat(this.txtTara.getText()),
                        this.clientDao.getByName(this.comboCliente.getValue()),
                        this.productDao.getByName(this.choiseProducto.getValue()),
                        this.vehicleDao.getByPatent(this.comboPatente.getValue())));
        clearFields();
        enableFields();
    }

    // Cancelar
    public void btnCancelarEvent(MouseEvent mouseEvent) {
        ((Node)(mouseEvent.getSource())).getScene().getWindow().hide();
    }

    /** Utils **/

    // Inicializar campos
    private void initFields(){
        List<Client> clientList = clientDao.getAll();
        List<Product> productList = productDao.getAll();

        for (Client c : clientList) {
            this.comboCliente.getItems().add(c.getName());
        }
        for (Product p : productList) {
            this.choiseProducto.getItems().add(p.getName());
        }
        this.choiseProducto.setValue(productList.get(0).getName()); //Valor por defecto

        this.labNroTicket.setText("Nro ticket: E-"+(ticketDao.getLastId()+1));

        this.labFechaHora.setText(getActualDate());
        this.txtNeto.setText(Float.toString(0));
        this.txtBruto.setText(Float.toString(0));
        this.txtTara.setText(Float.toString(0));
    }

    // Fecha y hora
    private String getActualDate(){
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat(DATE_FORMAT);
        return hourFormat.format(date);
    }

    // Limpiar campos
    private void clearFields(){
        this.txtNeto.setText(Float.toString(0));
        this.txtBruto.setText(Float.toString(0));

        this.labNroTicket.setText("Nro ticket: E-"+(ticketDao.getLastId()+1));
        this.labFechaHora.setText(getActualDate());
        calculateNetValue();
    }

    // Deshabilitar campos
    private void disableFields(){
        this.comboCliente.setDisable(true);
        this.comboPatente.setDisable(true);
        this.choiseProducto.setDisable(true);
        this.txtBruto.setDisable(true);
        this.txtTara.setDisable(true);
        this.txtNeto.setDisable(true);
    }

    // Habilitar campos
    private void enableFields(){
        this.comboCliente.setDisable(false);
        this.comboPatente.setDisable(false);
        this.choiseProducto.setDisable(false);
        this.txtBruto.setDisable(false);
        this.txtTara.setDisable(false);
        this.txtNeto.setDisable(false);
    }

    // Calcular neto
    public void calculateNetValue(){
        this.txtNeto.setText(Float.toString(Float.parseFloat(this.txtBruto.getText()) - Float.parseFloat(this.txtTara.getText())));
    }


}
