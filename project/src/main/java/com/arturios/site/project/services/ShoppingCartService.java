package com.arturios.site.project.services;

import com.arturios.site.project.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class ShoppingCartService {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    public void addToCart(HttpSession session, Long productId) {
        Product product = productService.getProductById(productId);
        System.out.println(product);
        //addToCart(session, product);
    }
}
