package phoneAs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class phoneBook extends phoneAs {
    public ArrayList<phoneNumber> phonelist = new ArrayList<>();

    @Override
    public void insetphone(String name, String phone) {
        for (phoneNumber p : phonelist) {
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
    public void remove(String name) {
        for (phoneNumber p : phonelist) {
            if (p.name.equals(name)) {
                phonelist.remove(p);
                return;
            }
        }
    }
    @Override
    public phoneNumber searchName(String name) {
        for (phoneNumber p : phonelist) {
            if (p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }
    @Override
    public void sort() {
        Collections.sort(phonelist, new Comparator<phoneNumber>() {
            @Override
            public int compare(phoneNumber o1,phoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
    @Override
    public void updatePhone(String name, String newName) {
        for (phoneNumber p:phonelist){
            if(p.name.equals(name)){
            p.phone  = newName;
            return;
            }
        }
    }
}
