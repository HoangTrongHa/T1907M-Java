package Baithaychua;

import java.util.Scanner;

public class Baitapphanso {
    public int tu_so;
    public int mau_so;

    public Baitapphanso() {
    }

    public Baitapphanso(int tu_so, int mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public int getTu_so() {
        return tu_so;
    }

    public void setTu_so(int tu_so) {
        this.tu_so = tu_so;
    }

    public int getMau_so() {
        return mau_so;
    }

    public void setMau_so(int mau_so) {
        this.mau_so = mau_so;
    }
public void inPut(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap tu so");
    setTu_so(sc.nextInt());
    System.out.println("Nhap mau so");
    int dieukien =sc.nextInt();
    setMau_so(dieukien!=0?dieukien:1);
//day la 1 dang viet tat
}
public void printf(){
    System.out.println("Phan so da nhap la"+getTu_so()+"/"+getMau_so());
}
//rutgon
    public int ucln(){
//        lam vong lap tu so 1 tim uoc lon nhat
        int ms = Math.abs(getMau_so());
        int ts = Math.abs(getTu_so());
        int uslc =1;
        for(int i =1;i<= Math.min(ts,ms);i++){
            if(ts%i==0 && ms%i ==0){
                uslc=i;
            }
        }
        return uslc;
    }
public void compact(){

}
//nghichdao
public void inverse(){
    if(getTu_so()!=0){
        int tmp=getTu_so();
        setTu_so(getMau_so());
        setMau_so(tmp);
    }else {
        System.out.println("khong the dao nguoc");
    }
}
public Baitapphanso addPhanso(Baitapphanso Fr){
        Baitapphanso rs = new Baitapphanso();
        rs.setMau_so(this.getMau_so()*Fr.getMau_so());
        rs.setTu_so(this.getTu_so()*Fr.getTu_so());

return rs;

}
public Baitapphanso subPhanso (Baitapphanso Fr){
        Baitapphanso rs = new Baitapphanso();
        rs.setMau_so(this.getMau_so()*Fr.getMau_so());
        rs.setTu_so(this.getTu_so()*Fr.getMau_so()-this.getMau_so()*Fr.getTu_so());
        return rs;
}
}
