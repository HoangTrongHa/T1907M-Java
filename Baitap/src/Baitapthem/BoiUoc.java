package Baitapthem;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BoiUoc {
    int a;
    int b;

    public BoiUoc() {
    }

    public static void UCLN() {
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void nhap2so(){
        Scanner c = new Scanner(System.in);
        System.out.println("Nhap so a:");
        a =c.nextInt();
        System.out.println("Nhap so b:");
        b=c.nextInt();
    }
    public void check(){
        if(a == 0 && b ==0){
            System.out.println("Error doawload");
            nhap2so();
        }
    }
    public static int UCLN(int a, int b){
        while(a!= b){
            if(a>b) a= a-b;
            else b= b-a;
        }
        return (a);
    }
    public void BCLN(){
        System.out.println("Boi Chung nho nhat la:"+((a*b)/UCLN(a,b)));
    }
    public void showInfor(){
        System.out.println("Uoc chung lon nhat la:"+UCLN(a,b));

    }
}
