package Proyekt.Service.ServiceImpl;

import Proyekt.Domain.Customer;
import Proyekt.Domain.Product;
import Proyekt.Enums.ProductCategoryTypeEnum;
import Proyekt.Enums.UserTypeEnum;
import Proyekt.Service.CustomerService;
import Proyekt.Service.OwnerService;

import static Proyekt.Service.CustomerService.CUSTOMERS;

public class OwnerServiceImpl implements OwnerService {
    {
        Customer owner = new Customer("owner","123", UserTypeEnum.OWNER);
        CUSTOMERS.add(owner);
    }

    @Override
    public boolean login(String userName, String password) {
        for (Customer customer:CUSTOMERS){
            if (customer.getUserName().equals(userName) && customer.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void showCategory() {
        ProductCategoryTypeEnum.showEnums();
    }

    @Override
    public void editCategory() {

    }

    @Override
    public void addProduct(String name,int amount, ProductCategoryTypeEnum typeEnum) {
        Product product = new Product(name,typeEnum,amount);
        PRODUCTS.add(product);
    }

    @Override
    public void showProducts() {
        for (Product product:PRODUCTS){
            System.out.println(product);
        }
    }

    @Override
    public void deleteProduct(int index) {
        for (Product product:PRODUCTS){
            if (product.getId().equals(index)){
                PRODUCTS.remove(product);
            }
        }
    }

    @Override
    public void editProduct(int index) {

    }
}
