package com.spsmb.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private Singleton() {}

    private String name = "Foo";

    public static Singleton getInstance() {
        return singleton;
    }

    public void doSomething() {
        System.out.println("Something");
    }

    public String getName() {
        return name;
    }
}
