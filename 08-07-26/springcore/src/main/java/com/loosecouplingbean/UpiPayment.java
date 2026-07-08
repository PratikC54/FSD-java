package com.loosecouplingbean;

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}