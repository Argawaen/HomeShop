package com.cursan.homeshop;

public class Product {

    String name;
    String description;
    double price;

    public void look() {
    }

    /**
     * @param bill
     * @param quantity
     */
    public void buy(Bill bill, Integer quantity) {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
