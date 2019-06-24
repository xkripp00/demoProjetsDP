import ocp.FinalFilter;
import ocp.enums.Color;
import ocp.enums.Size;
import ocp.Product;
import ocp.specifications.ColorPriceSpecification;
import ocp.specifications.ColorSpecification;
import ocp.specifications.PriceSpecification;
import ocp.specifications.SizeSpecification;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ocpDemo();
    }

    private static void ocpDemo() {
        Product car = new Product().setColor(Color.BLUE).setPrice(15000).setSize(Size.SMALL).setName("Car");
        Product bike = new Product().setColor(Color.BLUE).setPrice(1000).setSize(Size.MEDIUM).setName("Bike");
        Product notebook = new Product()
                .setColor(Color.GREEN)
                .setPrice(800)
                .setSize(Size.SMALL)
                .setName("Notebook");
        List<Product> listOfProducts = Arrays.asList(car, bike, notebook);

        FinalFilter f = new FinalFilter();
        f.filter(listOfProducts, new ColorSpecification(Color.BLUE)).forEach(i -> System.out.println(i.getName()));
        f.filter(listOfProducts, new SizeSpecification(Size.MEDIUM)).forEach(i -> System.out.println(i.getName()));
        f.filter(listOfProducts, new PriceSpecification(800)).forEach(i -> System.out.println(i.getName()));
        f.filter(listOfProducts, new ColorPriceSpecification(Color.GREEN, 800))
                .forEach(i -> System.out.println(i.getName()));
    }
}
