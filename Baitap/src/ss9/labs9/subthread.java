package ss9.labs9;

import java.time.LocalDate;

public class subthread extends Thread{
    @Override
    public void run() {
        super.run();
        LocalDate time = LocalDate.now();
    }
}
