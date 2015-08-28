package com.thoughtworks.baseline;

public class BillMachine {

    private final String item;
    private final double price;

    public BillMachine(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public double calculateTotalCost() {
        if (item.equals("Book"))
            return price;

        else if(item.equals("imported book")) return price + price * 5 / 100;

        else
            return price + Math.round(price * 10 / 100);
    }
}
