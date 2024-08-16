package com.demo.graphqlapp.service.impl;

import org.springframework.stereotype.Service;

import com.demo.graphqlapp.dto.ProductInput;
import com.demo.graphqlapp.entity.Product;
import com.demo.graphqlapp.repository.ProductRepository;
import com.demo.graphqlapp.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductInput productInput) {
        Product product = new Product();
        product.setProductName(productInput.getProductName());
        product.setProductPrice(productInput.getProductPrice());
        product.setProductDescription(productInput.getProductDescription());
        product.setProductQuantity(productInput.getProductQuantity());
        product.setCustomerId(productInput.getCustomerId());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(int id) {
        return productRepository.findById(id).get();
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
    
}
