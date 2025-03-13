package org.example.strategyDesignPattern.paymentStrategyImpl;

import org.example.strategyDesignPattern.paymentStrategy.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment done through UPI of Rs. " + amount);
    }
}
