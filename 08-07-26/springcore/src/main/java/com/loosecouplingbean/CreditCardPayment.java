package com.loosecouplingbean;

public class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}
