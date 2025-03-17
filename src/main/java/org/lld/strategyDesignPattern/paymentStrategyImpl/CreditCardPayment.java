package org.lld.strategyDesignPattern.paymentStrategyImpl;

import org.lld.strategyDesignPattern.paymentStrategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done through Credit Card of Rs. " + amount);
    }
}
