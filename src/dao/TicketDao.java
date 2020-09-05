package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Ticket;

import utils.Utils;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class TicketDao implements Utils {

    static File file = new File(TICKET_FILE);


    public TicketDao(){
        if(!file.exists()){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo 'data/tickets.json'\n" +
                            "Se creará nuevamente para continuar","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(TICKET_FILE));
                bw.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Ticket add(Ticket ticket){           // Ticket sin id //Ademas agregue aca el Imprimir
        List<Ticket> ticketList = this.getAll();
        ticket.setId(getLastId()+1);
        ticketList.add(ticket);
        this.update(ticketList);
        return ticket;
    }

    public int getLastId() {
        List<Ticket> ticketList = this.getAll();
        return !ticketList.isEmpty() ? ticketList.get(ticketList.size()-1).getId() : 0;
    }

    public void update(List<Ticket> ticketList){

        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String newJson = json.toJson(ticketList);

        try{
            BufferedWriter fOut = new BufferedWriter(new FileWriter(new File(TICKET_FILE)));
            fOut.write(newJson);
            fOut.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar datos de tickets","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean remove(Ticket ticket){
        List<Ticket> ticketList = this.getAll();
        if(ticketList.contains(ticket)){
            ticketList.remove(ticket);
            this.update(ticketList);
            return true;
        }else {
            return false;
        }
    }

    public List<Ticket> getAll(){

        List<Ticket> ticketList = new ArrayList<>();

        try {
            Gson gson = new Gson();
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(TICKET_FILE)));
            Type ticketType = new TypeToken<ArrayList<Ticket>>(){}.getType();
            ticketList = gson.fromJson(bufferedReader, ticketType);
            bufferedReader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos de tickets","Error de archivos",
                    JOptionPane.WARNING_MESSAGE);
        }
        return ticketList;
    }
}
