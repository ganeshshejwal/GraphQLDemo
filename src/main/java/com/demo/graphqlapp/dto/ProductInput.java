package com.demo.graphqlapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInput {
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private int customerId;
}
