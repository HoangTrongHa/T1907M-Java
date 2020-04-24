package ss10.DemoDongbohoa;

public class Accout {
    protected Integer money;
    public synchronized void deposit(Integer d){
money += d ;
        System.out.println("Nap tien thanh cong");
        try{
            notify();
        }catch (Exception e){

        }
    }
    public synchronized void pay(Integer p){
        if(money < p){
            System.out.println("Deo du tien");
try{
wait();
}catch (Exception e){

}
        }
        money -= p;
        System.out.println("Da rut tien");
    }
}
