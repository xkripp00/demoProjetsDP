package ocp.specifications;

import ocp.Product;
import ocp.enums.Size;
import ocp.interfaces.Specification;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.getSize() == this.size;
    }
}
