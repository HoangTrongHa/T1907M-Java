package ss10.DemoDongbohoa;
public class Domodongbohoa {
    public static void main(String[] args) {
Counter ct = new Counter();
Runnable runnable =()->{
for (int i=0;i<50;i++){
    synchronized (ct){
        ct.growUp();
        ct.showSleep();
    }
   try {
       Thread.sleep(1000);
    }catch (Exception e){
    }
}
};
Thread t1 = new Thread(runnable);//luong 1
        Thread t2 = new Thread(runnable);//luong 2
        t1.start();
        t2.start();
    }
}
