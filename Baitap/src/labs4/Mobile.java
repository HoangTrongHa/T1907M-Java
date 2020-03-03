package labs4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mobile<S, T,N> {
    public S bandName;
    public T seri;
    public N year;

    public Mobile() {
    }

    public Mobile(S bandName, T seri, N year) {
        this.bandName = bandName;
        this.seri = seri;
        this.year = year;
    }

    public S getBandName() {
        return bandName;
    }

    public void setBandName(S bandName) {
        this.bandName = bandName;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }
    public boolean check(){
        LocalDate madeYear = LocalDate.of((Integer)year,1,1);//tao ra 1 object cua localdate lay theo ngay
        LocalDate now = LocalDate.now();
        return (Integer) year >= (now.getYear() - 5);
    }

    public static void main(String[] args) {
//
LocalDate ls = LocalDate.now();//ngay hien tai
LocalDate ls2 = LocalDate.of(2019,3,22);
LocalDate ls3 = LocalDate.of(2020 ,2,2);
LocalDate ls4 = LocalDate.parse("2019-04-22");
LocalDate ls5 = ls3.minusYears(1);

        LocalDateTime dt = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2020,1,30,12,30,45);
        System.out.println(dt2);
        System.out.println("ls5:"+ls5);
        System.out.println("Nhap nam can kiem tra");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();
        LocalDate kt = LocalDate.of(x,2,28);
        LocalDate nextDay = kt.plusDays(1);
        if(nextDay.getDayOfMonth()==29){

        }
    }
}
