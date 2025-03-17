package org.lld.strategyDesignPattern;

import org.lld.strategyDesignPattern.paymentContext.PaymentContext;
import org.lld.strategyDesignPattern.paymentStrategyImpl.UpiPayment;


public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new UpiPayment());
        paymentContext.processPayment(51);
    }
}