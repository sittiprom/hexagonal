package com.example.hexagonal.adapter;

import com.example.hexagonal.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SpringDataProductRepository extends MongoRepository<Product, Integer> {
}
