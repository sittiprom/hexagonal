package com.example.hexagonal.adapter;

import com.example.hexagonal.domain.Product;
import com.example.hexagonal.outgoing.LoadProduct;
import com.example.hexagonal.outgoing.SaveProduct;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductRepository implements LoadProduct, SaveProduct {
    private SpringDataProductRepository repository;

    public ProductRepository(SpringDataProductRepository repository){
        this.repository = repository;
    }

    @Override
    public Optional<Product> load(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }
}
