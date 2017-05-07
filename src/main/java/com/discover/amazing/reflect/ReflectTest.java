package com.discover.amazing.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> clazz = Class.forName("com.discover.amazing.reflect.Car");
        Constructor<?> carConstructor = clazz.getDeclaredConstructor(String.class, Long.class);
        carConstructor.setAccessible(true);
        Car car = (Car) carConstructor.newInstance("Benz", 500000L);
        car.isExpensive();
       /* Class<?> car = Class.forName("com.discover.amazing.reflect.Car");
        Field priceField = car.getDeclaredField("price");
        Object carInstance = car.newInstance();
        priceField.setAccessible(true);
        priceField.set(carInstance, 150000L);
        boolean result =  (Boolean) fun1.invoke(carInstance);*/
    }

}
