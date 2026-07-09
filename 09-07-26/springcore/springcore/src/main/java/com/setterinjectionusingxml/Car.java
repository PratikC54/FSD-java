package com.setterinjectionusingxml;

public class Car {
    Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    public String display() {
       return specification.toString();
    }

}
