package com.thoughtworks.baseline;

public class ShoppingBasket {

    private final String item;
    private final double price;

    public ShoppingBasket(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double calculateTotalCost() {
        return price;
    }
}
