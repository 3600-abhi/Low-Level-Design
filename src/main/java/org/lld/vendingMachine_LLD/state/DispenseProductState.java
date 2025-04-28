package org.lld.vendingMachine_LLD.state;

import org.lld.vendingMachine_LLD.Coin;
import org.lld.vendingMachine_LLD.ItemShelf;
import org.lld.vendingMachine_LLD.VendingMachine;

public class DispenseProductState implements VendingMachineState {

    public DispenseProductState(VendingMachine vendingMachine, int shelfCode) throws Exception {
        System.out.println("Dispensing the Product");
        dispenseProduct(vendingMachine, shelfCode);
    }

    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot Insert Coin in DispenseState");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Cannot Insert Coin in DispenseState");
    }

    @Override
    public void pressChooseProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Cannot choose product in DispenseState");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        throw new Exception("Cannot choose product in DispenseState");
    }

    @Override
    public void refundFullAmount(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid Operation !!");
    }

    @Override
    public void returnChange(int amountToReturn) throws Exception {
        throw new Exception("Invalid Operation !!");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        for (ItemShelf shelf : vendingMachine.getShelves()) {
            if (shelf.getShelfCode() == shelfCode) {
                shelf.setItem(null);
                shelf.setIsItemAvailable(false);
            }
        }

        vendingMachine.setVendingMachineState(new IdleState());
    }
}
