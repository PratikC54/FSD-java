package com.fieldinjectionbyconstructorusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("fieldinjectionbyconstructorapplicationcontext.xml");
        Car car = (Car) context.getBean("mycar");

        System.out.println(car.details());
    }
}
