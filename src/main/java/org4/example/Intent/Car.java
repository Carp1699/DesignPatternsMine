package org4.example.Intent;

public class Car implements Prototype{
    private String brand;
    private String model;
    private String color;
    private int topSpeed;
    public Car(String brand, String model, String color, int topSpeed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;;
    }
    public Car(Car car){
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.topSpeed = car.topSpeed;;
    }
    public void getModel(){
        System.out.println(this.model);
    }
    @Override
    public Car clone() {
        return new Car(this);
    }
}
