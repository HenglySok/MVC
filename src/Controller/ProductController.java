package Controller;

import Model.Product;
import Model.dao.ProductDao;

import java.util.List;

public class ProductController {
    private static final ProductDao productDao = new ProductDao();

    public static List<Product> getAllProducts () {
        return productDao.findAllProducts();
    }

    public static Product addNewProduct(Product newProduct) {
        return productDao.addNewProduct(newProduct);
    }

    public static Product getProductByUuid(String uuid) {
        return productDao.findProductByUuid(uuid);
    }

    public static int deleteProductByUuid(String uuid) {
        return productDao.deleteProductByUuid(uuid);
    }
}
