package com.example.hexagonal.incoming;

import java.math.BigDecimal;

public interface SaleProduct {
    boolean sale(Integer id, BigDecimal amount);
}
