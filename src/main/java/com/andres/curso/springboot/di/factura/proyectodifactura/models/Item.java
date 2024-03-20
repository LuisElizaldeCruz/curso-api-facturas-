package com.andres.curso.springboot.di.factura.proyectodifactura.models;

public class Item {
    private Product product;
    private Integer quantity;

    public Item() {

    }

    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getImporte() {
        return quantity * product.getPrice();
    }
}
