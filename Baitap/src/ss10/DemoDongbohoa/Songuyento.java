package ss10.DemoDongbohoa;
public class Songuyento {

protected Integer SNT =2;
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public synchronized void nextPrime(){
        for (int i = 0; i == SNT + 1; i++){
            if(isPrimeNumber(i)){
                System.out.println(Thread.currentThread().getName()+"Next "+SNT);
                return;
            }
        }
    }
}
