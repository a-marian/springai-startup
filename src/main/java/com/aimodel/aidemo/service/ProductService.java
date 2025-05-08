package com.aimodel.aidemo.service;

import com.aimodel.aidemo.model.Product;
import com.aimodel.aidemo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findProductByName(String name){
        return productRepository.findByNameIgnoreCase(name);
    }
}
