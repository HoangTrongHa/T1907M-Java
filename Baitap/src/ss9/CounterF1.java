package ss9;

public class CounterF1 extends Thread{
    @Override
    public void run() {
        super.run();
        //ra cho xe khac
        //xin di nho
        for (int i = 0;i<100;i++){
            System.out.println("F1:"+i);

            try {
                Thread.sleep(10);
            }catch (Exception e){

            }
        }
        System.out.println("Cf1 Finish");
    }
}
