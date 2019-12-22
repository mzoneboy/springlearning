package com.discover.amazing.designpattern.factory;

import com.discover.amazing.inf.ICar;
import com.discover.amazing.model.Audi;
import com.discover.amazing.model.Benz;

public class SimpleFactory1 {
    public ICar createCar(String carName){
        if("audi".equals(carName)){
            return  new Audi();
        } else if ("benz".equals(carName)) {
            return new Benz();
        }

        return null;
    }

    public static void main(String[] args) {
        SimpleFactory1 carFactory = new SimpleFactory1();
        ICar audi = carFactory.createCar("audi");
        audi.getBrand();
        ICar benz = carFactory.createCar("benz");
        benz.getBrand();
    }
}
