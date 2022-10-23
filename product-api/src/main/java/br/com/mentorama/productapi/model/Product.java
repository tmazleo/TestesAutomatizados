package br.com.mentorama.productapi.model;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private Double maxDiscountParcentage;

    public Product(Long id, String name, Double price, Double maxDiscountParcentage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maxDiscountParcentage = maxDiscountParcentage;
    }

    public Double getPriceWithDiscount(final Double discount) {
        if(discount > maxDiscountParcentage) {
            return price * (1 - maxDiscountParcentage);
        } else {
            return price * (1 - discount);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMaxDiscountParcentage() {
        return maxDiscountParcentage;
    }

    public void setMaxDiscountParcentage(Double maxDiscountParcentage) {
        this.maxDiscountParcentage = maxDiscountParcentage;
    }
}
