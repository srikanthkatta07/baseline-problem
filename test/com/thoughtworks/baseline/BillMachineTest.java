package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillMachineTest {

    @Test
    public void costsZeroWhenNoItemsAddedToShoppingBasket() {
        BillMachine machine = new BillMachine("", 0.0);

        assertEquals(0, machine.calculateTotalCost(), 0.2d);
    }

    @Test
    public void costsToBookPriceWhenSingleBookAdded() {
        BillMachine machine = new BillMachine("Book", 12.0);

        assertEquals(12.0, machine.calculateTotalCost(), 0.2d);
    }
}
