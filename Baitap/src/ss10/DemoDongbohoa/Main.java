package ss10.DemoDongbohoa;
public class Main {
    public static void main(String[] args) {
      Songuyento songuyento = new Songuyento();
      Runnable r1 = ()->{
        for (int i = 0;i<30;i++){
            songuyento.nextPrime();
            try {
Thread.sleep(300);
            }catch (Exception e){
            }
        }
      };
      new Thread(r1).start();
      new Thread(r1).start();
    }
}
