package controllers;

import javafx.scene.input.MouseEvent;
import views.Menu;

import java.io.IOException;

public class MenuController {

    Menu menu = new Menu();

    public void addTicketEvent(MouseEvent mouseEvent) throws IOException {
        menu.addTicketView();
    }
}
