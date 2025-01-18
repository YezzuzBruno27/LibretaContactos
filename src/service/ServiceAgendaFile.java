package service;

import domain.Contact;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ServiceAgendaFile implements IServiceAgenda{
    private final String NAME_FILE = "agenda.txt";
    ArrayList<String> informationFile = new ArrayList<>();

    public ServiceAgendaFile(){
        File file = new File(NAME_FILE);
        if(file.exists()){
            //informationFile = getInformation(file);
        }else{
            try{
                PrintWriter printWriter = new PrintWriter(new FileWriter(file));
                System.out.println("The  file has been created successfully!");
            }catch (IOException e){
                System.out.println("Error: The file has not been created..."+ e.getMessage());
            }
        }
    }
    @Override
    public void createContact() {

    }

    @Override
    public Contact searchContact(int id) {
        return null;
    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public void listContacts() {

    }
}
