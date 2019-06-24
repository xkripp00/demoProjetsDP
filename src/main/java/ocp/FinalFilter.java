package ocp;

import ocp.interfaces.Filter;
import ocp.interfaces.Specification;

import java.util.List;
import java.util.stream.Stream;

public class FinalFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
