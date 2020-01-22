package Ex1;

import java.util.Scanner;

public class Tamgiacthuong {
    double a, b, c;

    public Tamgiacthuong() {
    }

    public Tamgiacthuong(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double chuvy() {
        double cv = a + b + c;
        return cv;
    }

    public void Nhap3canh() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap canh a =");
        a = s.nextDouble();
        System.out.println("Nhap canh b =");
        b = s.nextDouble();
        System.out.println("Nhap canh c =");
        c = s.nextDouble();
    }

    public double getDientich() {
        double s = Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
        return s;
    }

    public boolean kiemTra() {
        while (a <= 0 || b <= 0 || c <= 0) ;
        return (!(a + b <= c)) && (!(a + c <= b)) && (!(b + c <= a));
    }

    public void Show() {
        System.out.println("dien tich la:" + getDientich());
        System.out.println("Chu vi la" + chuvy());
    }
}
