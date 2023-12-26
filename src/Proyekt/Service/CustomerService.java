package Proyekt.Service;

import Proyekt.Domain.Customer;
import Proyekt.Domain.Product;

import java.awt.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public interface CustomerService {
    LinkedList<Customer> CUSTOMERS = new LinkedList<>();
    Set<Product> CUSTOMERPRODUCTS =new HashSet<Product>();
//    List CUSTOMERS = new List();

    void seeAllProductByCategory();

    void purchaseProduct(int index, int amount);
}
