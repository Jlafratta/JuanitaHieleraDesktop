package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Client;
import models.Product;
import utils.Files;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Files {

    static File file = new File(PRODUCT_FILE);

    public ProductDao(){
        if(!file.exists()){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo 'data/products.json'\n" +
                            "Se creará nuevamente para continuar","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(PRODUCT_FILE));
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(List<Product> productList){

        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String newJson = json.toJson(productList);

        try{
            BufferedWriter fOut = new BufferedWriter(new FileWriter(new File(PRODUCT_FILE)));
            fOut.write(newJson);
            fOut.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar datos de productos","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public List<Product> getAll(){

        List<Product> productList = new ArrayList<>();

        try {
            Gson gson = new Gson();
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(PRODUCT_FILE)));
            Type productType = new TypeToken<ArrayList<Product>>(){}.getType();
            productList = gson.fromJson(bufferedReader, productType);
            bufferedReader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos de productos","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return productList;
    }
}
