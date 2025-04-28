package org.lld.ATM_LLD;

import org.lld.ATM_LLD.states.ATMState;

public class ATM_Example {
    public static void main(String[] main) throws Exception {
        ATMCard atmCard = ATMCard.builder()
                                 .bankName("State Bank of India")
                                 .balance(1500)
                                 .pin("1234")
                                 .build();

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.getAtmState().insertATMCard(atmCard, atmMachine);

        atmMachine.getAtmState().verifyATMPin("1234", atmMachine);
        atmMachine.getAtmState().checkBalance(atmCard);
        
    }
}
