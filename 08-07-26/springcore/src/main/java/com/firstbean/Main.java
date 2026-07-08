package com.firstbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        MyBean myBean = (MyBean) context.getBean("mybean");

        myBean.setMessage("Hello from MyBean");
        System.out.println(myBean);



        ApplicationContext context1 = new ClassPathXmlApplicationContext("secondapplicationcontext.xml");
        SecondBean secondBean = (SecondBean) context1.getBean("secondbean");
        System.out.println(secondBean);
    }
}
