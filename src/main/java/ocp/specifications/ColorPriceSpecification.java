package ocp.specifications;

import ocp.Product;
import ocp.enums.Color;
import ocp.interfaces.Specification;

public class ColorPriceSpecification implements Specification<Product> {

    private Color color;
    private int price;

    public ColorPriceSpecification(Color color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.getPrice() == this.price && p.getColor() == this.color;
    }
}
