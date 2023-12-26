package Proyekt.Service.ServiceImpl;

import Proyekt.Domain.Product;
import Proyekt.Service.CustomerService;

import static Proyekt.Service.OwnerService.PRODUCTS;

public class CustomServiceImpl implements CustomerService {

    @Override
    public void seeAllProductByCategory() {
        for (Product product : PRODUCTS) {
            if (product == null) {
                System.out.println(product);
            } else {
                System.out.println("Product not found!");
            }
        }
    }

    @Override
    public void purchaseProduct(int index, int amount) {
        for (Product product : PRODUCTS) {
            if (product.getId().equals(index)) {
                CUSTOMERPRODUCTS.add(product);
            }
        }
    }
}
