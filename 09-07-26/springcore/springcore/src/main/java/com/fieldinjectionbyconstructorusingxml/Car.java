package com.fieldinjectionbyconstructorusingxml;

public class Car {
    Specification specification ;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public String details() {
       return specification.toString();
    }
}
