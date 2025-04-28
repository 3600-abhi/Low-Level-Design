package org.lld.ATM_LLD.states;

import org.lld.ATM_LLD.ATMCard;
import org.lld.ATM_LLD.ATMMachine;

public abstract class ATMState {
    public abstract void insertATMCard(ATMCard atmCard, ATMMachine atmMachine) throws Exception;

    public abstract void verifyATMPin(String inputPin, ATMMachine atmMachine) throws Exception;

    public abstract void withdrawCash(double inputAmount, ATMCard atmCard) throws Exception;

    public abstract void checkBalance(ATMCard atmCard) throws Exception;

    public abstract void terminate(ATMMachine atmMachine) throws Exception;
}
