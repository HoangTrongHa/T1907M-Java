package Session1;

public class Car {
    protected int year = 2015;
    protected String typeCar = "AutoCar";
    protected String brand = "Brand";

    public Car() {

    }

    public Car(int year, String typeCar, String brand) {
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }

    public void getInfo() {
        System.out.println("Brand" + brand);
    }
}
