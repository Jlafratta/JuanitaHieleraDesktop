package Views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class StartMenu extends Application {

    /* Metodo que se ejecuta antes de el start que inicializa la app */
    @Override
    public void init() throws Exception {
        System.out.println("Before");
    }

    /* Metodo que inicializa la app */
    @Override
    public void start(Stage stage) throws Exception{    // Stage = Ventana
        stage.setTitle("Menu principal");
        stage.setWidth(600);
        stage.setHeight(360);
        stage.setResizable(false);
        /* stage.initStyle(StageStyle.UTILITY); */   // Define la vista como utilidad, solo con X para cerrar
        VBox root = new VBox(); // Layout manager




        root.getChildren().addAll();
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
