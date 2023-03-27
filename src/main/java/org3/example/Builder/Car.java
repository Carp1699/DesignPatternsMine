package org3.example.Builder;

public class Car {
    private String type;
    private int doors;
    private String brand;
    Car(String type,int doors, String brand){
        this.type = type;
        this.doors = doors;
        this.brand = brand;
    }
    public void getDoors(){
        System.out.println(this.doors);
    }
}
