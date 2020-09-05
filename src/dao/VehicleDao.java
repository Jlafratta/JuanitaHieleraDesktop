package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Vehicle;
import utils.Utils;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao implements Utils {

    static File file = new File(VEHICLE_FILE);

    public VehicleDao(){
        if(!file.exists()){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo 'data/vehicles.json'\n" +
                            "Se creará nuevamente para continuar","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(VEHICLE_FILE));
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(List<Vehicle> vehicleList){

        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String newJson = json.toJson(vehicleList);

        try{
            BufferedWriter fOut = new BufferedWriter(new FileWriter(new File(VEHICLE_FILE)));
            fOut.write(newJson);
            fOut.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar datos de vehiculos","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public Vehicle getByPatent(String patent){
        List<Vehicle> vehicleList = this.getAll();
        for ( Vehicle v : vehicleList ) {
            if (v.getPatent().equals(patent)){
                return v;
            }
        }
        return null;
    }

    public List<Vehicle> getAll(){

        List<Vehicle> vehicleList = new ArrayList<>();

        try {
            Gson gson = new Gson();
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(VEHICLE_FILE)));
            Type vehicleType = new TypeToken<ArrayList<Vehicle>>(){}.getType();
            vehicleList = gson.fromJson(bufferedReader, vehicleType);
            bufferedReader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos de vehiculos","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return vehicleList;
    }

}
