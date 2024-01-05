package Collections.ShipmentProj.list.List_Before;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Collections.ShipmentProj.common.Product;

public class Shipment implements Iterable<Product> {

    private final static int PRODUCT_NOT_FOUND = -1;
    // private final static int MAX_VAN_WEIGHT = 20;

    private static List<Product> products = new ArrayList<>();

    List<Product> lightWeightProducts = new ArrayList<>();
    List<Product> heavyWeightProducts = new ArrayList<>();

    public boolean add(Product product) {
        return products.add(product);
    }

    public boolean replace(Product product_a, Product product_b) {

        int index = products.indexOf(product_a);

        if (index != PRODUCT_NOT_FOUND) {
            products.set(index, product_b);
            return true;
        }
        return false;
    }

    // public List<Product> getListOfLightProducts(Product product){

    // }

    @Override
    public Iterator<Product> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
