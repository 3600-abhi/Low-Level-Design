package org.lld.vendingMachine_LLD;

import lombok.Getter;

@Getter
public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(3),
    TEN(10),
    TWENTY(20);

    private final int amount;

    Coin(int amount) {
        this.amount = amount;
    }
}
