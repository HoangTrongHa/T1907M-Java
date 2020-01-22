package ex2;

public class Main {
    public static void main(String[] args) {
        Fraction p = new Fraction();
        p.Nhaptuma();
        p.check();
        p.showInfor();
        System.out.println("Nhap phan so tiep theo");


        Fraction l = new Fraction();
        l.Nhaptuma();
        l.check();
//        long tu1 =(p.getA()*l.getB());
//        long mau1 = (p.getB()*l.getA());
//        long tu2 =(p.getB()*l.getA());
//        long mau2 = (p.getA()*l.getB());
//        long tongtu = tu1 + tu2;
//        long tongmau = mau1+mau2;
        System.out.println("tong 2 phan so:"+((p.getA()*l.getB()) + (l.getA()*p.getB())+"/"+((l.getB()*p.getB())+(p.getB()*l.getB()))));
        System.out.println("Tich 2 phan so:"+(p.getA()*l.getA())+"/"+(p.getB()*l.getB()));
        System.out.println("Thuong 2 phan so"+(p.getA()*l.getB())+"/"+(p.getB()*l.getA()));
    }

}
