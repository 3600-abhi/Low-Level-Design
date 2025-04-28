package org.lld.ATM_LLD.states;

import org.lld.ATM_LLD.ATMCard;
import org.lld.ATM_LLD.ATMMachine;

public class PinVerificationState extends ATMState {
    @Override
    public void insertATMCard(ATMCard atmCard, ATMMachine atmMachine) throws Exception {
        throw new Exception("Cannot Insert ATM Card in PinVerificationState");
    }

    @Override
    public void verifyATMPin(String inputPin, ATMMachine atmMachine) throws Exception {
        if (inputPin != null && atmMachine != null && atmMachine.getAtmCard() != null && inputPin.equals(atmMachine.getAtmCard().getPin())) {
            System.out.println("** Pin Verified");
            atmMachine.setAtmState(new TransactionState());
        } else {
            throw new Exception("Incorrect Pin");
        }
    }

    @Override
    public void withdrawCash(double inputAmount, ATMCard atmCard) throws Exception {
        throw new Exception("Cash cannot be withdrawn in PinVerificationState");
    }

    @Override
    public void checkBalance(ATMCard atmCard) throws Exception {
        throw new Exception("Balance cannot be checked in PinVerificationState");
    }

    @Override
    public void terminate(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmCard(null);
        atmMachine.setAtmState(new IdleState());
        return;
    }
}
