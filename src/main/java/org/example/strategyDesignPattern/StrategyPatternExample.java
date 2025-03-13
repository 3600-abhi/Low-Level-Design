package org.example.strategyDesignPattern;

import org.example.strategyDesignPattern.paymentContext.PaymentContext;
import org.example.strategyDesignPattern.paymentStrategyImpl.UpiPayment;


public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new UpiPayment());
        paymentContext.processPayment(51);
    }
}