package BaicoThi;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            boolean quit = false;
            startPhone();
            printActions();
            while (!quit){
                System.out.println("\n Enter action : (6 to show avaiable actions)");
                Scanner scanner;
                int action = scanner.nextInt();
                scanner.nextLine();
                switch(action){
                    case 0 :
                        System.out.println("\n Shutting down....");
                        quit = true;
                        break;
                    case 1:
                        Object contactList = null;
                        contactList.prinftContact();
                        break;
                    case 2:
                        addNewContact();
                        break;
                    case 3:
                        updateContact();
                        break;
                    case 4:
                        removedContact();
                        break;
                    case 5:
                        queryContact();
                        break;
                    case 6:
                        printActions();
                        break;

                }
            }
        }

        private static void addNewContact(){
            System.out.println("Enter new contact name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone number");
            String phone = scanner.nextLine();
            Contact contact = new Contact(name, phone);
            if(contactList.addContact(contact)){
                System.out.println("New contact added : Name ="+ name +"phone = "+phone);
            }else{
                System.out.println("Cannot add, "+ name +"already on contact list");
            }
        }
        private static void updateContact(){
            System.out.println("Enter exsiting contact name :");
            String name = scanner.nextLine();
            Contact exsitingContact = contactList.queryContact(name);
            if(exsitingContact == null ){
                System.out.println("Contact not found");
                return ;
            }
            System.out.println("Enter new contact name");
            String newName = scanner.nextLine();
            System.out.println("Enter next phone number");
            String newPhone = scanner.nextLine();
            Contact contact = new Contact(newName, newPhone);
            if(contactList.updateContact(contact, contact)){
                System.out.println("Successfully update record");
            }else{
                System.out.println("Error updating record");
            }
        }

        private static void removedContact(){
            System.out.println("Enter existing contact name:");
            String name = scanner.nextLine();
            Contact existingContact = contactList.queryContact(name);
            if(existingContact==null){
                System.out.println("Contact not found");
                return;
            }

            if(contactList.removeContact(existingContact)){
                System.out.println("Successfully deleted");
            }else{
                System.out.println("Error deleted contact");
            }

        }

        private  static void queryContact(){
            System.out.println("Enter existing contact name:");
            String name = scanner.nextLine();
            Contact existingContact = contactList.queryContact(name);
            if(existingContact==null){
                System.out.println("Contact not found");
                return;
            }
            System.out.println("Name "+ existingContact.getName()+"phone number is"+ existingContact.getPhoneNumber());
        }
        private static void startPhone(){
            System.out.println("Starting phone ......");
        }

        private static void printActions(){
            System.out.println("\nAvaiable actions : \npress");
            System.out.println("0 - to shutdown \n"
                    +"1 - to print contacts \n"
                    +"2 - to add new contact \n"
                    +"3 - to update existing contact\n"
                    +"4 - to remove contact\n"
                    +"5 - query if an existing contact\n"
                    +"6 - to print a list avaiable actions");
            System.out.println("choose your action");
        }
    }
}
