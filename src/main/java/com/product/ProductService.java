package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    ProductDB db = new ProductDB();

    public void addProduct(Product p) {
//        products.add(p);

        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }

    public Product getProduct(String name) {
//        Product p = new Product();
        for(Product p : products){
            if(p.getName() == name){
                return p;
            }
        }

        return null;
    }

    public List<Product> getProductByText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str)){
                prods.add(p);
            }
        }

        return prods;
    }
}
