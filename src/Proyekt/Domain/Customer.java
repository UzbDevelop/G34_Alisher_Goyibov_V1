package Proyekt.Domain;

import Proyekt.Enums.UserTypeEnum;

public class Customer {
    static private Integer sequance = 0;

    {
        sequance++;
    }

    private Integer id = sequance;
    private String userName;
    private String password;
    private UserTypeEnum type;
    private Product products;

    public Customer() {
    }

    public Customer(String userName, String password,UserTypeEnum type) {
        this.userName = userName;
        this.password = password;
        UserTypeEnum customer = UserTypeEnum.CUSTOMER;
        setId(getId());
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
