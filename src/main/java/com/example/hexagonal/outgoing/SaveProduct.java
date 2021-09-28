package com.example.hexagonal.outgoing;

import com.example.hexagonal.domain.Product;

public interface SaveProduct {
    void save(Product product);
}
