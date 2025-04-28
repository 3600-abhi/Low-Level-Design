package org.lld.vendingMachine_LLD.state;

import org.lld.vendingMachine_LLD.Coin;
import org.lld.vendingMachine_LLD.VendingMachine;

public interface VendingMachineState {
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void pressChooseProductButton(VendingMachine vendingMachine) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception;

    public void refundFullAmount(VendingMachine vendingMachine) throws Exception;

    public void returnChange(int amountToReturn) throws Exception;

    public void dispenseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception;
}
