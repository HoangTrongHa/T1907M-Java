package ss9;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Ten:" + Thread.currentThread().getName());
        System.out.println("After:" + Thread.currentThread().getName());
        try {
            int i = 2;
            System.out.println("10 so chan dau tien la:");
            while (i <= 20) {
                System.out.println(i);
                i += 2;
                Thread.sleep(1500);
            }
        } catch (Exception e) {

        }

    }
    }
