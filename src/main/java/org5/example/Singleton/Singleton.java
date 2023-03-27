package org5.example.Singleton;

public class Singleton {
    private static Singleton singleton_instance = null;
    public String config;
    private Singleton (String config){
        this.config = config;
    }
    public static synchronized Singleton getInstance(String config){
        if (singleton_instance==null)
            singleton_instance= new Singleton(config);
        return singleton_instance;
    }
}
