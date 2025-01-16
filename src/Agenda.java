import java.util.ArrayList;

public class Agenda implements IAgenda {
    static int numberContacts = 0;
    static ArrayList<Contact> contacts = new ArrayList<Contact>();
    @Override
    public void createContact(){
        System.out.println("Hola mundo");
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
