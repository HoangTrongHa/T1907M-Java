package ss9;
public class Mainss9 {
    public static void main(String[] args) {
        CounterF1 counterF1 = new CounterF1();
        counterF1.start();
        MyThread myThread =new MyThread();
        myThread.start();
        for (int i = 0; i < 100 ;i++){
            System.out.println("Main -"+i);
            try {
                Thread.sleep(100);//cho thoi gian nghi 1 thoi gian nao do roi lai lam tiep
            }catch (Exception e){
            }
        }
        Thread.currentThread().setName("Ha co");
        System.out.println("Main Finish");
        System.out.println("Thread"+Thread.currentThread().getName());
        //lop an danh

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread tao tu lop an danh");
            }
        };
        new Thread(r1).start();
    }
}
