package com.discover.amazing.model;

import com.discover.amazing.inf.ICar;
import org.springframework.stereotype.Component;

@Component
public class Audi implements ICar {
    public void getBrand() {
        System.out.printf("My brand is %s \n", Audi.class.getSimpleName());
    }
}
