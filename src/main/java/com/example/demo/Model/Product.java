package com.example.demo.Model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class Product {
    private Long id;
    @Pattern(regexp = "^[a-zA-Z]+$",message = "Invalid name product")
    private String name;
    private Category category;

}
