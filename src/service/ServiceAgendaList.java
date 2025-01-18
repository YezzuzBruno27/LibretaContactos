package service;

import domain.Contact;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceAgendaList implements IServiceAgenda {
    static int numberContacts = 0;
    static ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public void createContact(){
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
        System.out.println("Contact has been successfully created!");
    }
    @Override
    public Contact searchContact(int id){
        for(Contact contact : contacts){
            if(contact.getId() == id){
                return contact;
            }
        }
        System.out.println("The contact has not been found");
        return null;
    }
    @Override
    public void deleteContact(int id){
        Contact contact = searchContact(id);
        if(contact != null){
            System.out.println("The contact was successfully deleted");
            contacts.remove(contact);
            numberContacts--;
        }
    }

    @Override
    public void listContacts(){
        if(contacts.size() == 0){
            System.out.println("The contact list is empty!");
            return;
        }
        for (Contact contact : contacts){
            System.out.println(contact);
        }
    }


}
