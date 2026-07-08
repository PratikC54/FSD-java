package com.loosecouplingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("loosecouplingapplicationcontext.xml");
        ShoppingCart cart1 = (ShoppingCart) context.getBean("shopingcartbyupi");
        cart1.checkout();

        ShoppingCart cart2 = (ShoppingCart) context.getBean("shopingcartbycard");
        cart2.checkout();


    }
}
