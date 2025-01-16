import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda implements IAgenda {
    static int numberContacts = 0;
    static ArrayList<Contact> contacts = new ArrayList<Contact>();
    @Override
    public void createContact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact's name: ");
        String name = input.nextLine();
        System.out.println("Enter contact's number: ");
        String number = input.nextLine();
        System.out.println("Enter contact's age: ");
        int age = input.nextInt();
        System.out.println("Enter contact's ocuppation: ");
        String occupation = input.nextLine();

        LocalDate date = LocalDate.now();
        Contact contact = new Contact(++numberContacts, name, number, age, occupation, date);
        contacts.add(contact);
    }
    @Override
    public Contact searchContact(int id){
        Contact contact = new Contact();
        System.out.println("");
        return contact;
    }
    @Override
    public void deleteContact(){

    }

    @Override
    public void listContacts(){

    }


}
