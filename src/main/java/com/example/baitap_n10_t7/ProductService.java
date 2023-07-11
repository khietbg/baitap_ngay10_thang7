package com.example.baitap_n10_t7;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static List<Product> products = new ArrayList<>();
    public List<Product> findAll(){
        return products;
    }
    public void save(Product product){
            if (products.size()==0){
                product.setId(1);
            }else {
                product.setId(products.get(products.size()-1).getId()+1);
            }
            products.add(product);
    }
}
