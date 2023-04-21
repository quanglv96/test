package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Model.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import java.util.List;

@RestController
@CrossOrigin("*")
@Validated
public class Controller {
    @PostMapping("/test")
    public ResponseEntity<?> validListProduct( @RequestBody @Valid  List<  Product> productList){
        System.out.println(productList);
        return ResponseEntity.ok().body(productList);
    }
    @PostMapping("/testValid")
    public ResponseEntity<?> validListVehicle( @RequestBody List<Vehicle> productList){
        System.out.println(productList);
        return ResponseEntity.ok().body(productList);
    }
}
