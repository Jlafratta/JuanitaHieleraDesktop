package controllers;

import views.Menu;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MenuController {

    Menu menu = new Menu();

    public void btnNuevoIngresoEvent(MouseEvent mouseEvent) throws IOException {
        menu.addTicketView();
    }

    public void btnTicketsEvent(MouseEvent mouseEvent) throws IOException {
        menu.listTicketsView();
    }

    public void btnClientesEvent(MouseEvent mouseEvent) {
    }

    public void btnVehiculosEvent(MouseEvent mouseEvent) {
    }
}
