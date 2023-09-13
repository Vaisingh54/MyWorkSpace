package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Collections.ShipmentProj.common.Product;

public class CollectionMain {

    public static void main(String[] args) {

        // var phone = new Product(2000, "IPhone");
        // var laptop = new Product(50000, "Laptop");
        // var tv = new Product(8000, "tv");

        Collection<Product> ls = new ArrayList<>();
        // ls.add(phone);
        // ls.add(laptop);
        // ls.add(tv);

        // Iterator<Product> it = ls.iterator();
        // while (it.hasNext()) {
        // var product = it.next();
        // System.out.println(product);
        // }

        // System.out.println(ls.size());
        // System.out.println(ls.isEmpty());
        // System.out.println(ls.contains(phone));
        // System.out.println(ls.remove(phone));
        // System.out.println(ls.contains(phone));

        // *********************************************************************************
        // */

        var toRemove = new ArrayList<Product>();
        // toRemove.add(phone);
        // toRemove.add(tv);
        System.out.println(ls.containsAll(toRemove));
        System.out.println(ls.removeAll(toRemove));

        Iterator<Product> it = ls.iterator();
        while (it.hasNext()) {
            var product = it.next();
            System.out.println(product);
        }

    }
}
