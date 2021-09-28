package com.example.hexagonal.adapter.configuration;

import com.example.hexagonal.adapter.SpringDataProductRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataProductRepository.class)
public class MongoDBConfiguration {
}
