package controllers;

import dao.ClientDao;
import dao.TicketDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import models.Client;
import models.Ticket;
import models.Vehicle;
import utils.Utils;

import java.net.URL;
import java.util.ResourceBundle;





public class ListClientController implements Initializable, Utils {

    public ObservableList<Client> ClientData = FXCollections.observableArrayList();

    @FXML
    public TableView<Client> tableClients;
    @FXML
    public TableColumn<Client, String> colClient;
    @FXML
    public TableColumn<Client, String> colNombre;
    @FXML
    public TableColumn<Client, String> colDni;

    @FXML
    public Button btnBuscar;
    @FXML
    public Button btnRefresh;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configTable();
        fillData();
    }

    public void configTable(){
        colClient.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDni.setCellValueFactory(new PropertyValueFactory<>("dni"));

        tableClients.setItems(ClientData);
    }

    public void fillData(){
        ClientData.clear();
        ClientDao clientDao = new ClientDao();

        ClientData.setAll(clientDao.getAll());
    }

    public void searchTicketEvent(MouseEvent mouseEvent) {
    }

    public void refreshEvent(MouseEvent mouseEvent) {
    }

    public void contextMenuEvent(ContextMenuEvent contextMenuEvent) {
    }

    public void btnBuscar_click(ActionEvent actionEvent) {
    }

    public void searchClientEvent(MouseEvent mouseEvent) {
    }

    public void btnRefresh_click(ActionEvent actionEvent) {
    }
}

