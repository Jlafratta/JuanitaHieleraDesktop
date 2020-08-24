package controllers;

import Models.Product;

public class ClientController {

         //service o dao


    public Product createVehicle (int id, String name, float price_x_Kg, float totalPrice){

        Product producto = new Product(id,name,price_x_Kg,totalPrice);


        return producto ; ///ProducDao.AddProduct

    }


}
