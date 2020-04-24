package ss10.DemoDongbohoa;

public class DeomoSync {
    public static void main(String[] args) {
        Accout n = new Accout();
        Runnable r2 = ()->{
          n.pay(10000);
        };
        new Thread(r2).start();
        Runnable r3 = ()->{
            n.deposit(20000);
        };
        new Thread(r3).start();
    }
}
