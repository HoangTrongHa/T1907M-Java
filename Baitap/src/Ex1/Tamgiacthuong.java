public class Tamgiacthuong {
    int a,b,c;

    public Tamgiacthuong() {
    }

    public Tamgiacthuong(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void chuvy(){
        double cv = a+b+c;
    }
    public void dientich(){
        double s = Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
    }
}
