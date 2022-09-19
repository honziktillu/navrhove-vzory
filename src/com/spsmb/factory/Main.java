package com.spsmb.factory;

import com.spsmb.factory.cars.Car;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car1 = factory.getCar("skoda");
        Car car2 = factory.getCar("bMw");
        Car car3 = factory.getCar("TeSla");
        Car car4 = factory.getCar(null);
        car1.drive();
        car2.drive();
        car3.drive();
        car4.drive();
    }

}
