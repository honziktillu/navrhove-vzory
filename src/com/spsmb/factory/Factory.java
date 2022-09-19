package com.spsmb.factory;

import com.spsmb.factory.cars.Bmw;
import com.spsmb.factory.cars.Car;
import com.spsmb.factory.cars.Skoda;
import com.spsmb.factory.cars.Tesla;

public class Factory {

    public Car getCar(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("skoda")) return new Skoda();
        if (type.equalsIgnoreCase("tesla")) return new Tesla();
        if (type.equalsIgnoreCase("bmw")) return new Bmw();
        return null;
    }

}
