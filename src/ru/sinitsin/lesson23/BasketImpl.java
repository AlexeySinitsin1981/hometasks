package ru.sinitsin.lesson23;

import java.util.ArrayList;
import java.util.List;

public class BasketImpl implements Basket{
    private ArrayList<Product> list = new ArrayList<Product>();


    @Override
    public void addProduct(String product, int quantity) {
    Product product1 = new Product(product, quantity);
    list.add(product1);
    }

    @Override
    public void removeProduct(String product) {
        /*for (Product pr:list) {
            if (pr.getNameProduct().equals(product)){
                list.remove(pr);
            }
        }*/
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().equals(product)){
                list.remove(list.get(i));
                break;
            }

        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product pr: list) {
            if(pr.getNameProduct().equals(product)){
                pr.setQuantityProduct(quantity);
            }
        }

    }

    @Override
    public void clear() {
        list.clear();

    }

    @Override
    public List<String> getProducts() {
        List<String> nameList = new ArrayList<>();
        for (Product p: list) {
            nameList.add(p.getNameProduct());

        }
        return nameList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product pr: list) {
            if(pr.getNameProduct().equals(product)){
                return pr.getQuantityProduct();
            }
        }
        return 0;
    }


}
