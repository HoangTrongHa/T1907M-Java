package ss9;

public class CounterF2 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("F2 - "+i);
            try {
                Thread.sleep(200);
            }catch (Exception e){}
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        // chang name
        Thread.currentThread().setName("Counter F2");
        System.out.println("After change name: "+Thread.currentThread().getName());
        System.out.println("F2 finish");
    }
}