package com.demo.graphqlapp.service;

import java.util.List;

import com.demo.graphqlapp.dto.ProductInput;
import com.demo.graphqlapp.entity.Product;

public interface ProductService {
    
    public Product createProduct(ProductInput productInput);
    
    public List<Product> getAllProducts();

    public Product getProduct(int id);

    public void deleteProduct(int id);

}
