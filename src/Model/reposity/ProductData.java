package Model.reposity;

import Model.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductData {
    public static List<Product> products
            = new ArrayList<>( List.of(
            new Product(UUID.randomUUID().toString(),"Key",50),
            new Product(UUID.randomUUID().toString(),"Mouse",100)
    ));
}
