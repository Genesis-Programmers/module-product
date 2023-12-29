package com.dxc.moduleproduct.service;

import com.dxc.moduleproduct.dto.ProductDto;
import com.dxc.moduleproduct.entity.Product;
import com.dxc.moduleproduct.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository repository;

    public Product add(ProductDto productDto) {

        Product product = Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .createdAt(LocalDateTime.now())
                .lastUpdated(LocalDateTime.now())
                .build();

        return repository.save(product);
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
