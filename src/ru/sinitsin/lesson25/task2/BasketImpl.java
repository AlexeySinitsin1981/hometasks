package ru.sinitsin.lesson25.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {
    private Map<String, Integer> map = new HashMap<>();



    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);

    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product, quantity);

    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> list1= new ArrayList();
        list1.addAll(map.keySet());
        return list1;
    }

    @Override
    public int getProductQuantity(String product) {
        if(map.get(product)==null){
            return 0;
        }else{
            return map.get(product);
        }


    }
}
