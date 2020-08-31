package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Utils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable, Utils {

    @FXML
    private Button btnNuevoIngreso;
    @FXML
    private Button btnTickets;
    @FXML
    private Button btnClientes;
    @FXML
    private Button btnVehiculos;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnNuevoIngresoEvent(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(VIEWS_PATH + "AddTicket.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Nuevo ingreso");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void btnTicketsEvent(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(VIEWS_PATH + "ListTickets.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Listado de tickets");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void btnClientesEvent(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(VIEWS_PATH + "ListClient.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Listado de vehiculos");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void btnVehiculosEvent(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(VIEWS_PATH + "ListVehicles.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Listado de vehiculos");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
