package sesson6;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args)throws Exception {
        try {
            int x = 0;
            int y =1000;
            int z = x/y;
            System.out.println(z);
             z = y/x;
            System.out.println(z);
        }catch (Exception e){
            System.out.println("Loi mat roi");
        }
        File f = new File("/Users/apple/Desktop/untitled.txt");
        String srt="";
        if(f.canWrite()){
            FileOutputStream fls= new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fls);
            dos.writeChars(srt+"COn me may \n");
            dos.close();
            fls.close();
        }
        if(f.canRead()){
            FileOutputStream fis = new FileOutputStream(f);
            DataOutputStream dis = new DataOutputStream(fis);

        }

    }

}
