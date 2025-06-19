package Model.dao;

import Model.Product;
import Model.reposity.ProductData;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductDao {
    // get all products
    public List<Product> findAllProducts() {
        return ProductData.products;
    }

    // add products
    public Product addNewProduct (Product newProduct) {
        ProductData.products.add(newProduct);
        return newProduct;
    }

    // find product by uuid
    public Product findProductByUuid(String uuid) {
        return ProductData.products
                .stream()
                .filter(p->p.getUuid().equals(uuid))
                .findFirst()
                .get();
    }

    // delete product by uuid
    public int deleteProductByUuid(String uuid) {
        try {
            Product findProduct = findProductByUuid(uuid);//this statement to find a product by uuid
            //if product is exiting it remove
            if (findProduct != null) {
                ProductData.products.remove(findProduct);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Product not found " + e.getMessage());
            return 0;
        }
        return 1;
    }
}
