package com.demo.graphqlapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.demo.graphqlapp.dto.CustomerInput;
import com.demo.graphqlapp.entity.Customer;

@Mapper
public interface CustomerMapper{
    
    CustomerMapper INSTANCE =  Mappers.getMapper(CustomerMapper.class);

    Customer customerInputToCustomer (CustomerInput customerInput);
    
}
