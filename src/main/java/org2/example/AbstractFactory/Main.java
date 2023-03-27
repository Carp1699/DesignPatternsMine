package org2.example.AbstractFactory;


public class Main {
    public static void main(String[] args) {
    AbstractFactory abstractFactory = FurnitureFactoryProducer.getFurnitureVariant(true);
    Furniture valedictorian = abstractFactory.getForniture("Chair");
    valedictorian.getDetails();
    AbstractFactory factory = FurnitureFactoryProducer.getFurnitureVariant(false);
    Furniture moderncheir = factory.getForniture("Couch");
    moderncheir.getDetails();

    }
}
