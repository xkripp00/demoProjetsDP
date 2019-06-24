package ocp.specifications;

import ocp.Product;
import ocp.enums.Color;
import ocp.interfaces.Specification;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return this.color == p.getColor();
    }
}
