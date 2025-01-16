import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda listContacts = new Agenda();
        Scanner input = new Scanner(System.in);
        int option = 1;
        do{
            System.out.println("MENU");
            System.out.println("1. Create contact");
            System.out.println("2. Search contact");
            System.out.println("3. Delete contact");
            System.out.println("4. List contact");
            System.out.println("Option: ");
            option = input.nextInt();
            input.nextLine();//se utiliza para consumir el salto de linea restante
            switch (option){
                case 1 -> listContacts.createContact();
                case 2 -> {
                    System.out.println("Enter contact's id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    Contact contact = listContacts.searchContact(id);
                    System.out.println(contact);
                }
                case 3 -> {
                    System.out.println("Enter contact's id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    listContacts.deleteContact(id);
                }
                case 4 -> listContacts.listContacts();
            }
        }
        while(option >= 1 && option <=4);

    }
}
