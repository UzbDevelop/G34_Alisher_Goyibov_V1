package Proyekt.Service;

import Proyekt.Domain.Product;
import Proyekt.Enums.ProductCategoryTypeEnum;

import java.util.*;

public interface OwnerService {

    Set<Product> PRODUCTS = new HashSet<>();

    boolean login(String userName, String password);

    void showCategory();

    void editCategory();

    void addProduct(String name, int amount, ProductCategoryTypeEnum typeEnum);
    void showProducts();

    void deleteProduct(int index);

    void editProduct(int index);

}
