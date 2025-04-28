package org.lld.ATM_LLD;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.lld.ATM_LLD.states.ATMState;
import org.lld.ATM_LLD.states.IdleState;

@Getter
@Setter
public class ATMMachine {
    private ATMCard atmCard;
    private ATMState atmState;

    public ATMMachine() {
        this.atmCard = null;
        this.atmState = new IdleState();
    }
}
