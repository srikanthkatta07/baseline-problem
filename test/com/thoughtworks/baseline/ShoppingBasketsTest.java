package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketsTest {

    @Test
    public void costsZeroWhenNoItemsAdded() {
        ShoppingBasket basket = new ShoppingBasket("", 0.0);

        assertEquals(0, basket.calculateTotalCost(), 0.3d);
    }
}
