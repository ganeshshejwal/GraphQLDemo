package com.demo.graphqlapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInput {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
}
