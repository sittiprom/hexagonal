package com.example.hexagonal.incoming;

import java.math.BigDecimal;

public interface PurchaseProduct {
    void purchase(Integer id, BigDecimal amount);
}
