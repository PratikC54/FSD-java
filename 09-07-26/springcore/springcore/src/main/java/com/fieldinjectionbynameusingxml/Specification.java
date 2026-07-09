package com.fieldinjectionbynameusingxml;

public class Specification {
    private String maker;
    private String model;

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
