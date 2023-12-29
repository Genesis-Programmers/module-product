package com.dxc.moduleproduct.controller;

import com.dxc.moduleproduct.dto.ProductDto;
import com.dxc.moduleproduct.entity.Product;
import com.dxc.moduleproduct.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private ProductService service;

    @PostMapping
    public Product add(@RequestBody ProductDto productDto) {
        return service.add(productDto);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
