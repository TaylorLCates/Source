package com.improving;

import javax.validation.constraints.NotEmpty;

public class Dranks {

    @NotEmpty(message = "Enter an ID")
    private final String id;
    @NotEmpty(message = "Enter a name")
    private final String name;
    @NotEmpty(message = "Enter a price")
    private final String price;
    @NotEmpty(message = "Enter a brand")
    private final String brand;

    public Dranks(String id, String name, String price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
