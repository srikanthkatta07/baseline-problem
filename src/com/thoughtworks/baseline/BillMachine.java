package com.thoughtworks.baseline;

public class BillMachine {

    private final String item;
    private final double price;

    public BillMachine(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double calculateTotalCost() {
        if (item.equals("book"))
            return price;
        return price + Math.round((price * 10 / 100) * 20 / 20.0);
    }
}
