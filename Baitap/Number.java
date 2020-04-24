import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int d,n,u1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap n ");
        n =scanner.nextInt();

        System.out.println("Moi nhap d");
        d=scanner.nextInt();
        System.out.println("moi nhap u1");
        u1 =scanner.nextInt();

        for (int i = 0;i<=2;i++){
            if (1<=n && n<=100){
                int[] u = new int[0];
                u[i] = u[i-1]+d;
                System.out.println("tong day so:"+u[i]);
            }else {
                System.out.println("Nhap sai");
            }
        }
    }
}
