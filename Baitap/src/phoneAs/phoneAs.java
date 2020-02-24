package phoneAs;

public  abstract class  phoneAs {
//    public String name;
//    public String phone;
//    public String newName;
    public abstract void insetphone(String name, String phone);
    public abstract void remove(String name);
    public abstract void updatePhone(String name, String newName);
    public abstract phoneNumber searchName(String name);
    public abstract void sort();
}
