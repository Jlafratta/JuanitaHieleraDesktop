package controllers;


import Models.Client;

public class ClientController {

         //service o dao


    public Client createClient (String id, String name, String dni, int state){

        Client client = new Client(id,name,dni,state);


        return client ; ///ClientDao.AddClient


    }






}