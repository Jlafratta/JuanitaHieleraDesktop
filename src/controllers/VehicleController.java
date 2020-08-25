package controllers;


import Dao.VehicleDao;
import Models.Client;
import Models.Vehicle;

public class VehicleController {


    VehicleDao vehicleDao;


    public VehicleController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }


    public Vehicle createVehicle (int id, String patente, String nombre, String modelo, String marca, Client cliente){

        Vehicle vehicle= new Vehicle(id,patente,nombre,modelo,marca,cliente);


        return vehicle ; ///VehicleDao.AddVehicle
    }




    }



