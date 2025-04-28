package org.lld.vendingMachine_LLD.state;

import org.lld.vendingMachine_LLD.Coin;
import org.lld.vendingMachine_LLD.VendingMachine;

import java.util.ArrayList;

public class IdleState implements VendingMachineState {

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Switching to AcceptCoinState");
        vendingMachine.setVendingMachineState(new AcceptCoinState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("First Press Insert Coin Button");
    }

    @Override
    public void pressChooseProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("First Press Insert Coin Button & Make Payment");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        throw new Exception("First Press Insert Coin Button & Make Payment");

    }

    @Override
    public void refundFullAmount(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid Operation !!");
    }

    @Override
    public void returnChange(int amountToReturn) throws Exception {
        throw new Exception("Invalid Operation");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        throw new Exception("Invalid Operation !!");
    }
}
