package com.example.hexagonal.adapter.configuration;

import com.example.hexagonal.HexagonalApplication;
import com.example.hexagonal.adapter.ProductRepository;
import com.example.hexagonal.services.ProductService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class BeanConfiguration {

    ProductService productService(ProductRepository repository){
        return  new ProductService(repository,repository);
    }
}
