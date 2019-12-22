package com.discover.amazing.designpattern.factory;

import com.discover.amazing.inf.ICar;
import com.discover.amazing.model.Audi;
import com.discover.amazing.model.Benz;

public class SimpleFactory2 {
    public ICar createCar(Class<? extends  ICar> carClass){
        try {
            return carClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        SimpleFactory2 carFactory = new SimpleFactory2();
        ICar audi = carFactory.createCar(Audi.class);
        audi.getBrand();
        ICar benz = carFactory.createCar(Benz.class);
        benz.getBrand();
    }
}
