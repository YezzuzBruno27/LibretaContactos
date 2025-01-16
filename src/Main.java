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
                    int id = input.nextInt();
                    listContacts.searchContact(id);
                }
                case 3 -> {
                    int id = input.nextInt();
                    listContacts.deleteContact(id);
                }
                case 4 -> listContacts.listContacts();
            }
        }
        while(option >= 1 && option <=4);

    }
}
