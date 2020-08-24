package controllers;


import Dao.ProductDao;
import Models.Product;


public class ProductController {

    ProductDao productDao;

    //SERVICE O DAO

    public Product createProduct (int id, String name, float price_x_Kg, float totalPrice){

       Product producto = new Product(id,name,price_x_Kg,totalPrice);


        return producto ; ///ProducDao.AddProduct

    }



}
