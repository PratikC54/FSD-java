package com.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentscan.xml");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee.toString());

        Car car = (Car) context.getBean("car");

        System.out.println(car.toString());
    }
}
