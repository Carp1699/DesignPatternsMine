package org3.example.Builder;

public class Director {
    public void buildFord(CarBuilder builder){
        builder.type("COUPE");
        builder.doors(5);
        builder.brand("FORD Racing");

    }
}
