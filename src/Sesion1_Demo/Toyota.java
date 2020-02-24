package Sesion1_Demo;

import Session1.Car;

public class Toyota extends Car {
    protected int price;
public Toyota(){

    }
    public Toyota(int year, String typeCar, String brand, int price) {
        super(year, typeCar, brand);
        this.price = price;
    }


    public void showInfo() {
        System.out.println("Year" + year);
    }
    public void getInfo(){
        System.out.println("Toyota 2019");
    }

}
