package org.phenom;

public class Car {
    String name;
    float price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
