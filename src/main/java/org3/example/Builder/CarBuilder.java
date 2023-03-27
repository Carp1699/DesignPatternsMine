package org3.example.Builder;

public class CarBuilder {
    private String type;
    private int doors;
    private String brand;
    public void type(String type){
        this.type = type;
    }

    public void brand(String brand){
        this.brand = brand;
    }
    public void doors(int doors){
        this.doors = doors;
    }
    public Car build(){
        return new Car(type, doors, brand);
    }
}
