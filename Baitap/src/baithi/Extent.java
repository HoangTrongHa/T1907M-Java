package baithi;

import java.util.ArrayList;

public class Extent extends AddressBooks {
    public ArrayList<Contact> ContactList = new ArrayList<>();
    public static void startContact(){
        System.out.println("AddressBook ...");
    }
    @Override
    public void AddnewContact(String name, String phone, String Company, String Email) {
        for (Contact p : ContactList) {
//    nhet vao 1 p nhat tung thang ra de xu ly
            if (p.name.equals(name)) {
                if (p.phone.equals(phone)) {
                    return;
                }
                p.phone = p.phone + ":" + phone;
            }
        }
    }

    @Override
    public Contact Search(String name) {
        for (Contact p : ContactList) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void Display() {
        System.out.println();
    }
}
