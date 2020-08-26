package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Client;
import utils.Files;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class ClientDao implements Files {

    static File file = new File(CLIENT_FILE);

    public ClientDao(){
        if(!file.exists()){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo 'data/clients.json'\n" +
                            "Se creará nuevamente para continuar","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(CLIENT_FILE));
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(List<Client> clientList){

        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String newJson = json.toJson(clientList);

        try{
            BufferedWriter fOut = new BufferedWriter(new FileWriter(new File(CLIENT_FILE)));
            fOut.write(newJson);
            fOut.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar datos de clientes","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public List<Client> getAll(){

        List<Client> clientList = new ArrayList<>();

        try {
            Gson gson = new Gson();
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(CLIENT_FILE)));
            Type clientType = new TypeToken<ArrayList<Client>>(){}.getType();
            clientList = gson.fromJson(bufferedReader, clientType);
            bufferedReader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos de clientes","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return clientList;
    }

}
