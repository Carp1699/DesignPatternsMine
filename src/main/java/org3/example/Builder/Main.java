package org3.example.Builder;
public class Main {
    public static void main(String[] args) {
//        CarBuilder builder = new CarBuilder();
//        builder.type("SUV");
//        builder.brand("FORD");
//        builder.doors(4);
//        Car car = builder.build();
//        car.getDoors();
        Director director = new Director();
        CarBuilder builder1 = new CarBuilder();
        director.buildFord(builder1);
        Car car1 = builder1.build();
        car1.getDoors();
        ////
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.type("SUV");
        carBuilder.doors(3);
        carBuilder.brand("Mazda");
        Car car = carBuilder.build();
        car.getDoors();
    }
}