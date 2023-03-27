package org2.example.AbstractFactory;

public class ModernFurnitureFactory extends AbstractFactory{
    @Override
    public Furniture getForniture(String fornitureModel) {
        if (fornitureModel.equalsIgnoreCase("Chair"))return new ModernChair();
        else if (fornitureModel.equalsIgnoreCase("Couch"))return new ModernCouch();
        return null;
    }
}
