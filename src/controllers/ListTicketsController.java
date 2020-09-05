package controllers;

import dao.TicketDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class ListTicketsController implements Initializable, Utils {

    public ObservableList<Ticket> ticketsData = FXCollections.observableArrayList();

    @FXML
    public TableView<Ticket> tableTickets;
    @FXML
    public TableColumn<Ticket, String> colTicket;
    @FXML
    public TableColumn<Ticket, String> colFecha;
    @FXML
    public TableColumn<Ticket, String> colHora;
    @FXML
    public TableColumn<Vehicle, String> colPatente;
    @FXML
    public TableColumn<Client, String> colCliente;
    @FXML
    public TableColumn<Ticket, Float> colNeto;
    @FXML
    public DatePicker datePicker;
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
        colTicket.setCellValueFactory(new PropertyValueFactory<>("idCompound"));
        colFecha.setCellValueFactory(new PropertyValueFactory<>("day"));
        colHora.setCellValueFactory(new PropertyValueFactory<>("time"));
        colPatente.setCellValueFactory(new PropertyValueFactory<>("vehicle"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("client"));
        colNeto.setCellValueFactory(new PropertyValueFactory<>("neto"));
        tableTickets.setItems(ticketsData);
    }

    public void fillData(){
        ticketsData.clear();
        TicketDao ticketDao = new TicketDao();
        //ObservableList<Ticket> tickets = (ObservableList<Ticket>) ticketDao.getAll();
        ticketsData.setAll(ticketDao.getAll());
    }

    public void searchTicketEvent(MouseEvent mouseEvent) {
    }

    public void refreshEvent(MouseEvent mouseEvent) {
    }

    public void contextMenuEvent(ContextMenuEvent contextMenuEvent) {
    }
}
