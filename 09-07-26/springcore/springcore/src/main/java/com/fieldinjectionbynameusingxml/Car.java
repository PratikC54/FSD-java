package com.fieldinjectionbynameusingxml;

public class Car {
    Specification specification ;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String details() {
       return specification.toString();
    }
}
