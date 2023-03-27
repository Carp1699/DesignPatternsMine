package org2.example.AbstractFactory;

public class ModernChair implements Furniture,Chair{

    @Override
    public void getDetails() {
        System.out.println("Im a modern Chair");
    }

    @Override
    public void color() {
        System.out.println("Color of the chair: ");
    }
}
