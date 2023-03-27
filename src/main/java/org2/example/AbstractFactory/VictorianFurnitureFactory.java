package org2.example.AbstractFactory;

public class VictorianFurnitureFactory extends AbstractFactory {
    @Override
    public Furniture getForniture(String fornitureModel) {
        if (fornitureModel.equalsIgnoreCase("Chair"))return new VictorianChair();
        else if (fornitureModel.equalsIgnoreCase("Couch"))return new VictorianCouch();
        return null;
    }
}
