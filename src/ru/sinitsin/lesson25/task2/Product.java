package ru.sinitsin.lesson25.task2;

public class Product {
    public String nameProduct;
    public int quantityProduct;

    public Product(String nameProduct, int quantityProduct) {
        this.nameProduct = nameProduct;
        this.quantityProduct = quantityProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", quantityProduct=" + quantityProduct +
                '}';
    }
}
