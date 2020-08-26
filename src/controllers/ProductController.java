package controllers;


import dao.ProductDao;
import models.Product;


public class ProductController {

    ProductDao productDao;

    //SERVICE O DAO

    public Product createProduct (int id, String name, float totalPrice){

       Product producto = new Product(id,name,totalPrice);

        return producto ; ///ProducDao.AddProduct

    }



}
