package com.demo.graphqlapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.graphqlapp.dto.CustomerInput;
import com.demo.graphqlapp.entity.Customer;
import com.demo.graphqlapp.entity.Product;
import com.demo.graphqlapp.repository.CustomerRepository;
import com.demo.graphqlapp.repository.ProductRepository;
import com.demo.graphqlapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    private final ProductRepository productRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }
    
    public Customer createCustomer(CustomerInput customerInput) {
        Customer customer = new Customer();
        customer.setFirstName(customerInput.getFirstName());
        customer.setLastName(customerInput.getLastName());
        customer.setEmail(customerInput.getEmail());
        customer.setMobileNumber(customerInput.getMobileNumber());

        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            List<Product> products = productRepository.findByCustomerId(customer.getId());
            customer.setProducts(products); 
        }
        return customers;
    }

    public Customer getCustomer(int id) {
        Customer customer = customerRepository.findById(id).get();
        List<Product> products = productRepository.findByCustomerId(customer.getId());
        customer.setProducts(products);
        return customer;
    }

    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
