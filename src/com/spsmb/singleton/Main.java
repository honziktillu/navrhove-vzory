package com.spsmb.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        System.out.println(singleton.getName());
    }

}
