package controllers;

import dao.ClientDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import models.Client;
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
    public TableColumn<Client, String> colCuit;
    @FXML
    public TableColumn<Client, String> colphoneNumber;
    @FXML
    public TableColumn<Client, String> coldirection;
    @FXML
    public TableColumn<Client, String> colLocality;
    @FXML
    public Button btnBuscar;
    @FXML
    public Button btnRefresh;
    @FXML
    public TextField txtBuscar;
    @FXML
    public ChoiceBox choiceBuscar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configTable();
        fillData();
    }

    public void configTable(){
        colClient.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCuit.setCellValueFactory(new PropertyValueFactory<>("cuit"));
        colphoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        coldirection.setCellValueFactory(new PropertyValueFactory<>("direction"));
        colLocality.setCellValueFactory(new PropertyValueFactory<>("locality"));
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

