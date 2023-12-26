package Proyekt.Enums;

public enum ProductCategoryTypeEnum {
    IPHONE(1,"Iphone"),
    SAMSUNG(2,"Samsung"),
    TV(3,"TV"),
    LAPTOP(4,"Laptop"),
    BOSHQA(5,"Boshqa");

    ProductCategoryTypeEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public final int index;
    public final String name;

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public static void showEnums() {
        ProductCategoryTypeEnum[] roleEnums = ProductCategoryTypeEnum.values();
        for (ProductCategoryTypeEnum role : roleEnums) {
            System.out.println(role.getIndex() + " " + role.getName());
        }
    }

    public static ProductCategoryTypeEnum setTypeByIndex(int index) {
        ProductCategoryTypeEnum[] roleEnums = ProductCategoryTypeEnum.values();
        for (ProductCategoryTypeEnum roleEnum : roleEnums) {
            if (roleEnum.getIndex() == index) {
                return roleEnum;
            }
        }
        return BOSHQA;
    }
}
