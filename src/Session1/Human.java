package Session1;

public class Human {
    public int age = 10;


    //    hamkhoitao
    public Human() {
        System.out.println("Vua tao 1 object Human");
    }

    public Human(String msg) {
        System.out.println(msg);
    }

    public Human(int x) {
        age = x;
        System.out.println("Vua set age");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int setYear(int year) {
        return year;
    }

//nap trong
    public void getInfo() {
        System.out.println();
    }
    public void getINfo(int a){
        System.out.println("hello");
    }
//    ghi de
}
