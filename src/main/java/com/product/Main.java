package com.product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        Product p = new Product();

        ProductService service = new ProductService();

//        service.addProduct(new Product(1, "Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product(2, "LG AC Remote", "Remote", "White Table", 2021));
        service.addProduct(new Product(3, "Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product(4, "Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product(5, "Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product(6, "Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product(7, "Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product(8, "Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product(9, "Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product(10, "Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product(11, "Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product(12, "Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product(13, "Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product(14, "Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product(15, "Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product(16, "BlackBeast", "Computer", "White Table", 2020));
        service.addProduct(new Product(17, "Airpods", "Earphone", "White Table", 2022));


//        List<Product> products = service.getAllProducts();
//
//        for(Product p : products){
//            System.out.println(p);
//        }
//
//        System.out.println("==========================================================================================");
//
//        System.out.println(service.getProduct("Airpods"));

//        System.out.println("==========================================================================================");
//
//        List<Product> prods = service.getProductByText("black");
//        for(Product p : prods){
//            System.out.println(p);
//        }
    }
}