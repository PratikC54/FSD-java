package com.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Value("Tayota")
    private String maker;
    @Value("Supra")
    private String model;
    @Value("Pink")
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
