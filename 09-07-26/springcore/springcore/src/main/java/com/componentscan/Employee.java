package com.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("1")
    private int id;

    @Value("Pratik")
    private String name;

    @Value("10000")
    private double salary;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
