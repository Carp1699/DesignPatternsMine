package org2.example.AbstractFactory;

public class VictorianChair implements  Furniture, Chair{

    @Override
    public void getDetails() {
        System.out.println("im a victorianchair");
    }

    @Override
    public void color() {
        System.out.println("Color of the chair: " );
    }
}
