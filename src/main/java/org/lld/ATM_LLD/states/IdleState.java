package org.lld.ATM_LLD.states;

import org.lld.ATM_LLD.ATMCard;
import org.lld.ATM_LLD.ATMMachine;

public class IdleState extends ATMState {

    @Override
    public void insertATMCard(ATMCard atmCard, ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmCard(atmCard);
        atmMachine.setAtmState(new PinVerificationState());
        System.out.println("** ATM Card Inserted");
    }

    @Override
    public void verifyATMPin(String inputPin, ATMMachine atmMachine) throws Exception {
        throw new Exception("Pin Cannot be verified in IdleState");
    }

    @Override
    public void withdrawCash(double inputAmount, ATMCard atmCard) throws Exception {
        throw new Exception("Cash cannot be withdrawn from IdleState");
    }

    @Override
    public void checkBalance(ATMCard atmCard) throws Exception {
        throw new Exception("Balance cannot be checked inside IdleState");
    }

    @Override
    public void terminate(ATMMachine atmMachine) throws Exception {
        System.out.println("Already in Idle State");
        return;
    }
}
