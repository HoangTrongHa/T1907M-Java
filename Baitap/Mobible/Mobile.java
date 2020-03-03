package Mobible;

import java.time.LocalDate;
import java.util.Date;

public class Mobile {
    String hangsanxuat;
    int Seri;
    int Year;
    LocalDate date;


    public Mobile() {
    }

    public Mobile(String hangsanxuat, int seri, int year, Date date) {
        this.hangsanxuat = hangsanxuat;
        Seri = seri;
        Year = year;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getSeri() {
        return Seri;
    }

    public void setSeri(int seri) {
        Seri = seri;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public static LocalDate check(LocalDate mobieDate){

        LocalDate now = LocalDate.now();
        if (now.compareTo(mobieDate) <0){
            System.out.println("con han");
            return now;
        }
        System.out.println("het han nhe");
        return now;
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Date date = new Date();
        Mobile mobile = new Mobile();
        mobile.setDate(now);
        System.out.println(mobile.getDate());
        System.out.println(now);
        LocalDate date1 = LocalDate.parse("2017-06-22");
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2017-06-23");
        System.out.println(date2);
        System.out.println(Mobile.check(date2));
//        System.out.println(date2.compareTo(date1));
    }


}
