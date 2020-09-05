package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.Utils;

import java.io.IOException;


public class Start extends Application implements Utils {

    /* Metodo que se ejecuta antes de el start que inicializa la app */
    /*@Override
    public void init() throws Exception {
        System.out.println("Before");
    }*/

    /* Metodo que inicializa la app */
    @Override
    public void start(Stage stage) throws Exception{    // Stage = Ventana
        Parent root = FXMLLoader.load(getClass().getResource(VIEWS_PATH + "Menu.fxml"));
        stage.setTitle("Menu principal");
        stage.setResizable(false);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /* Metodo que se ejecuta al cerrar la app */
    /*@Override
    public void stop() throws Exception {
        System.out.println("After");
    }*/
}
