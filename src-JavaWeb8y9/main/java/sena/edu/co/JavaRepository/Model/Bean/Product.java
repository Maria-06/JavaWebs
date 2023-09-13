package sena.edu.co.JavaRepository.Model.Bean;

public class Product {
    private Integer productId;
    private String productName;
    private Integer productValue;
    private Integer categoryIdFK;


    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(Integer productId, String productName, Integer productValue, Integer categoryIdFK) {
        this.productId = productId;
        this.productName = productName;
        this.productValue = productValue;
        this.categoryIdFK = categoryIdFK;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductValue() {
        return productValue;
    }
    public void setProductValue(Integer productValue) {
        this.productValue = productValue;
    }

    public Integer getCategoryIdFK() {
        return categoryIdFK;
    }

    public void setCategoryIdFK(Integer categoryIdFK) {
        this.categoryIdFK = categoryIdFK;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId" + productId +
                ", productName='" + productName + '\'' +
                ", productValue='" + productValue + '\'' +
                ", categoryIdFK='" + categoryIdFK + '\'' +
                '}';
    }
}
