package org5.example.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance("Config de la base de datos");
        Singleton y = Singleton.getInstance("Config de la base de datos ");
        Singleton z = Singleton.getInstance("Config de la base de datoss");
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
        System.out.println(x.config);
    }
}
