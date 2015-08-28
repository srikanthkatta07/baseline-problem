package com.thoughtworks.baseline;

public class BillMachine {

    private final String item;
    private final double price;

    public BillMachine(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double calculateTotalCost() {
        return price;
    }
}
