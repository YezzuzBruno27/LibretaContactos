package presentacion;

import service.IServiceAgenda;
import service.ServiceAgendaList;
import domain.Contact;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IServiceAgenda agenda = new ServiceAgendaList();
        Scanner input = new Scanner(System.in);
        int option = 1;
        do{
            System.out.println("MENU");
            System.out.println("1. Create contact");
            System.out.println("2. Search contact");
            System.out.println("3. Delete contact");
            System.out.println("4. List contact");
            System.out.println("5. Exit");
            System.out.println("Option: ");
            try{
                option = input.nextInt();
                input.nextLine();//se utiliza para consumir el salto de linea restante
            }catch (InputMismatchException e){
                System.out.println("Error: The data must be an integer");
                input.nextLine(); // consumir el caracter de salto de linea
                continue; // para mostrar de nuevo el menu
            }
            switch (option){
                case 1 -> agenda.createContact();
                case 2 -> {
                    try{
                        System.out.println("Enter contact's id: ");
                        int id = input.nextInt();
                        input.nextLine();
                        Contact contact = agenda.searchContact(id);
                        System.out.println(contact);
                    }catch(InputMismatchException e){
                        System.out.println("Error: The data must be an integer");
                        input.nextLine(); // para consumir el caracter de salto de linea
                    }
                }
                case 3 -> {
                    try{
                        System.out.println("Enter contact's id: ");
                        int id = input.nextInt();
                        input.nextLine();
                        agenda.deleteContact(id);
                    }catch (InputMismatchException e){
                        System.out.println("Error: The data must be an integer");
                    }
                }
                case 4 -> agenda.listContacts();
                case 5 -> System.out.println("Exiting the program!");
                default -> System.out.println("Invalid option ... Try again!");
            }
        }
        while(option != 5);
    }
}
