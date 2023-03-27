package org2.example.AbstractFactory;

import java.util.Objects;

public class FurnitureFactoryProducer {
    public static AbstractFactory getFurnitureVariant(boolean isVictorian){
        if(isVictorian){return new VictorianFurnitureFactory();}
        else {return new ModernFurnitureFactory();}
    }
}
