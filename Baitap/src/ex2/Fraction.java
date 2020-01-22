package ex2;

import java.util.Scanner;

public class Fraction {
    private long a;
    private long b;

    public Fraction() {
    }
    public Fraction(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public long getA() {
        return a;
    }
    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }
    public void setB(long b) {
        this.b = b;
    }

    public void Nhaptuma() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap canh a =");
        a = s.nextInt();
        System.out.println("Nhap canh b =");
        b = s.nextInt();
    }
    //dieu kien
    public boolean check(){
        if( b != 0){
            return true;
        }
        return false;

    }

    //so rut gon
    public double rutGon(){
        System.out.println(b);
        double c =(double)(a) / (double)(b);
        return c;
    }
    public void showInfor(){
        System.out.println("phan so da nhap la:"+getA()+"/"+getB());
        System.out.println("So nghich dao"+getB()+"/"+getA());
        System.out.println("So rut gon la:"+rutGon());

    }
}
