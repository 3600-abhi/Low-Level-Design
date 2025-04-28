package org.lld.ATM_LLD.states;

import org.lld.ATM_LLD.ATMCard;
import org.lld.ATM_LLD.ATMMachine;

public class TransactionState extends ATMState {
    @Override
    public void insertATMCard(ATMCard atmCard, ATMMachine atmMachine) throws Exception {
        throw new Exception("ATM Card cannot be inserted in TransactionState");
    }

    @Override
    public void verifyATMPin(String inputPin, ATMMachine atmMachine) throws Exception {
        System.out.println("Pin is already verified");
        return;
    }

    @Override
    public void withdrawCash(double inputAmount, ATMCard atmCard) throws Exception {
        if (atmCard != null && atmCard.getBalance() > inputAmount) {
            atmCard.setBalance(atmCard.getBalance() - inputAmount);
            System.out.println("Cash of amount: " + inputAmount + " has be dispensed");
        } else {
            throw new Exception("Insufficient balance");
        }
    }

    @Override
    public void checkBalance(ATMCard atmCard) throws Exception {
        if (atmCard != null) {
            System.out.println("Your current balance is : " + atmCard.getBalance());
        } else {
            throw new Exception("Invalid Card");
        }
    }

    @Override
    public void terminate(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmCard(null);
        atmMachine.setAtmState(new IdleState());
        System.out.println("Cancelling....");
        System.out.println("Back to Idle State");
    }
}
