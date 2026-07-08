package com.constructorinjectionusingxml;

public class Car {
    Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public String display() {
        return specification.toString();
    }
}
