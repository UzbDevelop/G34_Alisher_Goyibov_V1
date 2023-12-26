package Proyekt.Domain;

import Proyekt.Enums.ProductCategoryTypeEnum;

public class Product {
    private Integer counter = 0;

    {
        counter++;
    }

    private Integer id = counter;
    private String name;
    private ProductCategoryTypeEnum type;
    private Integer amount;

    public Product() {
    }

    public Product(String name, ProductCategoryTypeEnum type, Integer amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        setType(type);
        setId(getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategoryTypeEnum getType() {
        return type;
    }

    public void setType(ProductCategoryTypeEnum type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }
}
