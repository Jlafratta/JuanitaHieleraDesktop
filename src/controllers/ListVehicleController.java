package controllers;

import dao.TicketDao;
import dao.VehicleDao;
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

public class ListVehicleController implements Initializable, Utils {

    public ObservableList<Vehicle> vehiclesData = FXCollections.observableArrayList();

    @FXML
    public TableView<Vehicle> tableVehicles;
    @FXML
    public TableColumn<Vehicle, String> colVehicle;
    @FXML
    public TableColumn<Vehicle, String> colPatente;
    @FXML
    public TableColumn<Vehicle, String> colDescription;
    @FXML
    public TableColumn<Vehicle, String> colCliente;
    @FXML
    public TableColumn<Vehicle, Float> colTara;
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
        colVehicle.setCellValueFactory(new PropertyValueFactory<>("id"));
        colPatente.setCellValueFactory(new PropertyValueFactory<>("patent"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colTara.setCellValueFactory(new PropertyValueFactory<>("tara"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("client"));

        tableVehicles.setItems(vehiclesData);
    }

    public void fillData(){
        vehiclesData.clear();
        VehicleDao vehicleDao = new VehicleDao();

        vehiclesData.setAll(vehicleDao.getAll());
    }

    public void searchVehicleEvent(MouseEvent mouseEvent) {
    }

    public void refreshEvent(MouseEvent mouseEvent) {
    }

    public void contextMenuEvent(ContextMenuEvent contextMenuEvent) {
    }

    public void btnRefresh_click(ActionEvent actionEvent) {
    }

    public void btnBuscar_click(ActionEvent actionEvent) {
    }
}
