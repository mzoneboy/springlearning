package com.discover.amazing.designpattern.factory;

import com.discover.amazing.inf.ICar;
import com.discover.amazing.model.Audi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFactory {
    public ICar createCar(String carName){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.discover.amazing.model");
        return (ICar) context.getBean(carName);
    }

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        // context.setConfigLocation("classpath:/META-INF/spring/amazing-base-auto.xml");
        //context.refresh();
        SpringFactory springFactory = new SpringFactory();
        ICar carBean = springFactory.createCar("audi");
        carBean.getBrand();
    }
}
