package com.qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier(value = "petrolEngine")
    Engine engine;

    @Autowired
    @Qualifier(value = "diselEngine")
    Engine engine1;



    public void run() {
        engine.start();
        System.out.println("Car starts running");

        engine1.start();
        System.out.println("Car starts running");
    }
}
