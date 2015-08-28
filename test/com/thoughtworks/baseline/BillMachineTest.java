package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillMachineTest {

    @Test
    public void givesZeroPriceWhenNoItemsAddedToShoppingBasket() {
        BillMachine machine = new BillMachine("", 0.0);

        assertEquals(0, machine.calculateTotalCost(), 0.2d);
    }

    @Test
    public void givesItsPriceWhenSingleBookAddedToShoppingBasket() {
        BillMachine machine = new BillMachine("Book", 12.0);

        assertEquals(12.0, machine.calculateTotalCost(), 0.2d);
    }

    @Test
    public void giveItsPriceAlongSalesTaxWhenOtherGoodsAddedToShoppingBasket() {
        BillMachine machine = new BillMachine("MusicCD", 12.0);

        assertEquals(13.2,machine.calculateTotalCost(),0.2d);
    }
}
