package org.lld.vendingMachine_LLD.state;

import org.lld.vendingMachine_LLD.Coin;
import org.lld.vendingMachine_LLD.VendingMachine;

import java.util.ArrayList;

public class AcceptCoinState implements VendingMachineState {


    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Received Coin of Rs : " + coin.getAmount());
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void pressChooseProductButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Switching to ChooseProductState");
        vendingMachine.setVendingMachineState(new ChooseProductState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        throw new Exception("First Press Choose Product Button");
    }

    @Override
    public void refundFullAmount(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunding full payment");
        vendingMachine.setCoinList(new ArrayList<>());
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
