package ocp;

import ocp.enums.Color;
import ocp.enums.Size;

public class Product {

    private Size size;
    private Color color;
    private int price;
    private String name;

    public Size getSize() {
        return size;
    }

    public Product setSize(Size size) {
        this.size = size;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Product setColor(Color color) {
        this.color = color;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }
}
