package org.lld.strategyDesignPattern.paymentContext;

import org.lld.strategyDesignPattern.paymentStrategy.PaymentStrategy;

public class PaymentContext {
    private final PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
