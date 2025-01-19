package service;

import domain.Contact;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceAgendaFile implements IServiceAgenda{
    private final String NAME_FILE = "agenda.txt";
    private int numberContacts = 0;
    ArrayList<Contact> contacts = new ArrayList<>();

    public ServiceAgendaFile(){
        File file = new File(NAME_FILE);
        if(file.exists()){
            getContacts(file);
        }else{
            try{
                PrintWriter fileCreated = new PrintWriter(new FileWriter(file));
                fileCreated.close();
                System.out.println("The  file has been created successfully!");
            }catch (IOException e){
                System.out.println("Error: The file has not been created..." + e.getMessage());
            }
        }
    }
    private void getContacts(File file){
        try{
            BufferedReader agenda = new BufferedReader(new FileReader(file));
            String line = agenda.readLine();
            int count = 0;
            while(line != null){
                    String dataContact[] = line.split(",");
                    Contact contact = new Contact(Integer.parseInt(dataContact[0]),dataContact[1],dataContact[2],Integer.parseInt(dataContact[3]),dataContact[4],LocalDate.parse(dataContact[5]));
                    contacts.add(contact);
                line = agenda.readLine();
                count++;
            }
            if(count == 0){
                System.out.println("The list of contacts is empty");
            }else{
                System.out.println("The contacts has been obtained successfully");
            }
            agenda.close();
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }

    @Override
    public void createContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact's name: ");
        String name = input.nextLine();
        System.out.println("Enter contact's number: ");
        String number = input.nextLine();
        boolean ageInvalid = true;
        int age = 0;
        while(ageInvalid){
            try{
                System.out.println("Enter contact's age: ");
                age = input.nextInt();
                input.nextLine();//se utiliza para consumir el salto de linea restante
                ageInvalid = false;
            }catch (InputMismatchException e){
                System.out.println("Error: The data (age) must be an integer... try again!");
                input.nextLine();
            }
        }
        System.out.println("Enter contact's ocuppation: ");
        String occupation = input.nextLine();

        LocalDate date = LocalDate.now();
        Contact contact = new Contact(++numberContacts, name, number, age, occupation, date);
        contacts.add(contact);
        saveTheContactInTheFile(contact);
    }

    private void saveTheContactInTheFile(Contact contact){
        File file = new File(NAME_FILE);
        boolean exist = file.exists();
        try{
            PrintWriter contactsFile = new PrintWriter(new FileWriter(file, exist));
            contactsFile.println(contact.generateStringContact());
            contactsFile.close();
            System.out.println("The contact has been saved to the disk");
        } catch (IOException e){
            System.out.println("ERROR: The contact has not been saved to the disk" + e.getMessage());
        }
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
