package Session1;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Xin chao ong tuong Ha co");
        Human e = new Human(15);
        System.out.println("Tuoi ong nay la\n" + h.age);
        h.getInfo();


        Car c = new Car();
        System.out.println("chiec xe nay la\n" + c.year);
        System.out.println("Type" + c.typeCar);


    }
}
