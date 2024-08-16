package com.demo.graphqlapp.service;

import java.util.List;

import com.demo.graphqlapp.dto.CustomerInput;
import com.demo.graphqlapp.entity.Customer;

public interface CustomerService {
    
    public Customer createCustomer(CustomerInput customerInput);
    
    public List<Customer> getAllCustomers();

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);

}
