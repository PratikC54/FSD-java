package com.loosecouplingbean;

class ShoppingCart {
    private final Payment payment;

    public ShoppingCart(Payment payment) {
        this.payment = payment;
    }

    public void checkout() {
        payment.pay();
        System.out.println("Order placed successfully");
    }
}