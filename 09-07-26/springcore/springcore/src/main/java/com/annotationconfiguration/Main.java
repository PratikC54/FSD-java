package com.annotationconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Employee employee = context.getBean(Employee.class);

        System.out.println(employee.toString());
    }
}
