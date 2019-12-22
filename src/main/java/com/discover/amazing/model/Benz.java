package com.discover.amazing.model;

import com.discover.amazing.inf.ICar;


public class Benz implements ICar {
    public void getBrand() {
        System.out.printf("My brand is %s \n", Benz.class.getSimpleName());
    }
}
