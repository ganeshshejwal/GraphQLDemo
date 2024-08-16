package com.demo.graphqlapp.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.demo.graphqlapp.dto.CustomerInput;
import com.demo.graphqlapp.entity.Customer;
import com.demo.graphqlapp.service.CustomerService;


@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @MutationMapping("createCustomer")
    public Customer createCustomer(@Argument CustomerInput customerInput) {
        return customerService.createCustomer(customerInput);
    }

    @QueryMapping("getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    @QueryMapping("getCustomer")
    public Customer getCustomer(@Argument int id) {
        return customerService.getCustomer(id);
    }

    @MutationMapping("deleteCustomer")
    public boolean deleteCustomer(@Argument int id) {
        customerService.deleteCustomer(id);
        return true;
    }

}
