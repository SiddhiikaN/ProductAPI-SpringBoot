package com.siddhika.productapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.siddhika.productapi.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
