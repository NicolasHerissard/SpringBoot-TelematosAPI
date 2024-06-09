package com.example.telematos_api.controller;

import com.example.telematos_api.Entity.Product;
import com.example.telematos_api.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Controller
@RestController
@RequestMapping(path = "/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "", produces = APPLICATION_JSON_VALUE)
    public List<Product> getAll() {
        return this.productService.getAllProducts();
    }
}
