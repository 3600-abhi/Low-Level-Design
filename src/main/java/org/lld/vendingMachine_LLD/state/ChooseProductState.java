package org.lld.vendingMachine_LLD.state;

import org.lld.vendingMachine_LLD.Coin;
import org.lld.vendingMachine_LLD.Item;
import org.lld.vendingMachine_LLD.ItemShelf;
import org.lld.vendingMachine_LLD.VendingMachine;

import java.util.ArrayList;

public class ChooseProductState implements VendingMachineState {


    @Override
    public void pressInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Switching back to AcceptCoinState");
        vendingMachine.setVendingMachineState(new AcceptCoinState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Please press Insert coin button");
    }

    @Override
    public void pressChooseProductButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Please Choose product !!");
        return;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        if (vendingMachine != null && vendingMachine.getShelves() != null) {
            for (ItemShelf shelf : vendingMachine.getShelves()) {
                if (shelfCode == shelf.getShelfCode()) {
                    if (shelf.getIsItemAvailable() != null && !shelf.getIsItemAvailable()) {
                        throw new Exception("Shelf : " + shelfCode + " is Empty");
                    }

                    Item item = shelf.getItem();
                    int amountPaidByCustomer = vendingMachine.getCoinList().stream()
                                                             .map(Coin::getAmount)
                                                             .reduce(0, Integer::sum);

                    if (item.getPrice() > amountPaidByCustomer) {
                        refundFullAmount(vendingMachine);
                    } else {
                        if (item.getPrice() < amountPaidByCustomer) {
                            returnChange(amountPaidByCustomer - item.getPrice());
                        }

                        System.out.println("Switching to DispenseProductState");
                        vendingMachine.setCoinList(new ArrayList<>());
                        vendingMachine.setVendingMachineState(new DispenseProductState(vendingMachine, shelfCode));
                    }
                }
            }

            throw new Exception("Invalid Shelf Code Entered");
        }
    }

    @Override
    public void refundFullAmount(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCoinList(new ArrayList<>());
        System.out.println("Refunded full amount");
    }

    @Override
    public void returnChange(int amountToReturn) throws Exception {
        System.out.println("Return Change of Rs. " + amountToReturn);
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int shelfCode) throws Exception {
        throw new Exception("Cannot Dispense product in ChooseProductState");
    }
}
