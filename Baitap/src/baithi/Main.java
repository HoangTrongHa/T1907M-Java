package baithi;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Extent contactlist = new Extent();
    private  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name, company, email, phone;
        boolean quit = false;
        Extent.startContact();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: 4 to show avaiable actions");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\n Shutting down ...");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter name");
                    name = sc.next();
                    System.out.println("Enter company");
                    company = sc.next();
                    System.out.println("Enter email address");
                    email = sc.next();
                    System.out.println("Enter phone number");
                    phone = sc.next();
                    contactlist.addnewContact(new Contact(name, company, email, phone));
                    break;
                case 2:
                    String nameFind;
                    System.out.println("Enter name to find: ");
                    nameFind = sc.next();
                    contactlist.findContact(nameFind);
                case 3:
                    contactlist.showContact();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    printActions();
                    break;
            }
        }
    }
    private static void printActions(){
        System.out.println("\nAvaiable action: \n press");
        System.out.println("0 - to shutdown \n"
                + "1 - Add new contact \n"
                + "2 - Find a contact by name \n"
                + "3 - Display contacts \n"
                + "4 - Exit ");
        System.out.println("Choose your actions: ");
    }

}