package org.lld.vendingMachine_LLD;

import lombok.Getter;
import lombok.Setter;
import org.lld.vendingMachine_LLD.state.VendingMachineState;

import java.util.List;

@Getter
@Setter
public class VendingMachine {
    private ItemShelf[] shelves;
    private List<Coin> coinList;
    private VendingMachineState vendingMachineState;
}
