package ocp.specifications;

import ocp.Product;
import ocp.interfaces.Specification;

public class PriceSpecification implements Specification<Product> {

    private int price;

    public PriceSpecification(int price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.getPrice() == this.price;
    }
}
