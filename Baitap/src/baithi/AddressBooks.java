package baithi;

public abstract class   AddressBooks<E> {
    public abstract void AddnewContact(String name, String phone,String Company,String Email);
    public abstract Contact Search(String name);
    public abstract void Display();

}
