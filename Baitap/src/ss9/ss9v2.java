package ss9;


public class ss9v2 {

    public static void main(String[] args) {
        CounterF1 c11 = new CounterF1(); // luong 1
        
        CounterF2 c22= new CounterF2(); //luong2
        Thread thread = new Thread(c22);
//        thread.setDaemon(true);
        Thread thread1 = new Thread(c22);

        c11.start();
        try{
            c11.join();
        }catch (Exception e){

        }
        thread.start();
    }
}
