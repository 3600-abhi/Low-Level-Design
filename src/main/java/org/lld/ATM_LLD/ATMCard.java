package org.lld.ATM_LLD;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ATMCard {
    private String bankName;
    private double balance;
    private String pin;
}
