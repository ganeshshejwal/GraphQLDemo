package com.demo.graphqlapp.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.demo.graphqlapp.dto.ProductInput;
import com.demo.graphqlapp.entity.Product;
import com.demo.graphqlapp.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @MutationMapping("createProduct")
    public Product createProduct(@Argument ProductInput productInput) {
        return productService.createProduct(productInput);
    }

    @QueryMapping("getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok().body(products);
    }

    @QueryMapping("getProduct")
    public Product getProduct(@Argument int id) {
        return productService.getProduct(id);
    }
    
    @MutationMapping("deleteProduct")
    public boolean deleteProduct(@Argument int id) {
        productService.deleteProduct(id);
        return true;
    }
}
