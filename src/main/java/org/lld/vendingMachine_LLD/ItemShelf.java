package org.lld.vendingMachine_LLD;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {
    private Integer shelfCode;
    private Item item;
    private Boolean isItemAvailable;
}
