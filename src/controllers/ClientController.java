package controllers;


import models.Client;

public class ClientController {

         //service o dao


    public Client createClient (int id, String name, String dni, int state){

        Client client = new Client(id, name,dni,state);


        return client ; ///ClientDao.AddClient


    }






}
