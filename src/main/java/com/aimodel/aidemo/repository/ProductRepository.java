package com.aimodel.aidemo.repository;

import com.aimodel.aidemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByNameIgnoreCase(String name);

}
