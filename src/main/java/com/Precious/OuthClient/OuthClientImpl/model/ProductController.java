package com.Precious.OuthClient.OuthClientImpl.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<String> getAllProducts(){
        return Arrays.asList("samsung", "iPhone", "others");

    }
    @GetMapping("/update")
    public String update(){
        return "only logged in users can access this endpoint";
    }

}
