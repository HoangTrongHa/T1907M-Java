package ss3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {
    public static void main(String[] args) {
        ArrayList<String> srr = new ArrayList<>();
        srr.add("Thang khon nan");
        srr.add("herr");
        srr.add("Thang khon nan");
        srr.add("herr");srr.add("Thang khon nan");
        srr.add("herr");
        System.out.println(srr);
        System.out.println("kich thuoc cua ham"+srr.size());
        HashSet<String> add=new HashSet<>();
        add.add("wdwdwdw");
        add.add("wdwdwdw");
        add.add("1w");

        //        ham nay khong the co nhung phan tu trung nhau
        for (String s:add){
            System.out.println(s);
        }
//        co chuc nang sap xep theo an pha be
        PriorityQueue<String>priorityQueue=new PriorityQueue<>();

        priorityQueue.add("Hoang Trong Ha");
        priorityQueue.add("Mai Van Kiem");
        priorityQueue.add("Do truong giang");
        priorityQueue.add("Nguyen Xuan Huy");
        priorityQueue.add("Nguyen Phuong Linh");
        priorityQueue.add("Con Me May");
        priorityQueue.add("Thang Oc Cho");

        System.out.println("i2n ra priorityqueue");
        for(String s :priorityQueue){
            System.out.println(s);
        }
for(;priorityQueue.isEmpty();){
    System.out.println(priorityQueue.poll());
    System.out.println("Sau khi lay hang cho con lai: "+priorityQueue.size());
}

        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("phong cua hoang trong ha","phong 150m2");
        hashMap.put("phong cua V.anh","phong 50m2");
        hashMap.put("phong cua Huyen","phong 10m2");
        hashMap.put("phong cua Nhan","phong 15m2");
//        key - value
        System.out.println(hashMap.get("phong cua hoang trong ha"));

        HashMap<Integer,String> chuoi=new HashMap<>();
        chuoi.put(0,"Hoang Trong Ha");
        chuoi.put(2,"Pham thi Loam");
        chuoi.put(3,"Nguyen Phuong Linh");
        System.out.println("In ra chuoi");
        System.out.println(3);
    }
    public  String toString(){
return "hello word";
    }
}
