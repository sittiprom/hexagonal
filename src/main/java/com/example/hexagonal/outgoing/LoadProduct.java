package com.example.hexagonal.outgoing;

import com.example.hexagonal.domain.Product;

import java.util.Optional;

public interface LoadProduct {
    Optional<Product> load(Integer id);
}
