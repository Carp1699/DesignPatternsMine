package org4.example.Intent;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ford","f150","red",150);
        Car copyOfCar = car.clone();
        car.getModel();
        copyOfCar.getModel();
        System.out.println(car.hashCode());
        System.out.println(copyOfCar.hashCode());
    }
}
