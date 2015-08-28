package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketsTest {

    @Test
    public void costsZeroWhenNoItemsAdded() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0, basket.calculateTotalCost(),0.2d);
    }
}
