package org.example.strategyDesignPattern.paymentContext;

import org.example.strategyDesignPattern.paymentStrategy.PaymentStrategy;

public class PaymentContext {
    private final PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
