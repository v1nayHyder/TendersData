package org.phenom;

public class Bus {
    String name;

    public Bus(String name, float price) {
        this.name = name;
        this.price = price;
    }

    float price;

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
