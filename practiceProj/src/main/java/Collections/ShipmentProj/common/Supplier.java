package Collections.ShipmentProj.common;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public String toString() {

        return "Supplier : { " + "name = " + name + " Products = [ " + products + " ]";
    }

}
