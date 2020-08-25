package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Menu extends Application {

    /* Metodo que se ejecuta antes de el start que inicializa la app */
    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }

    /* Metodo que inicializa la app */
    @Override
    public void start(Stage stage) throws Exception{    // Stage = Ventana
        Parent root = FXMLLoader.load(getClass().getResource("resources/Menu.fxml"));
        stage.setTitle("Menu principal");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addTicketView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("resources/AddTicket.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Nuevo ingreso");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void listTicketsView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("resources/ListTickets.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Listado de tickets");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    /* Metodo que se ejecuta al cerrar la app */
    @Override
    public void stop() throws Exception {
        System.out.println("After");
    }
}
