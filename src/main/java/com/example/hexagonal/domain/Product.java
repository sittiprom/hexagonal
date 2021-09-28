package com.example.hexagonal.domain;


import lombok.Getter;

import java.math.BigDecimal;

public class Product {

   @Getter
   private Integer id;
   @Getter
   private String name;
   @Getter
    private BigDecimal qty;

    public Product(Integer id,String name,BigDecimal qty){
        this.id = id;
        this.name = name;
        this.qty = qty;

    }

    public boolean sale(BigDecimal amount) {
        if(qty.compareTo(amount) < 0) {
            return false;
        }
        qty = qty.subtract(amount);
        return true;
    }

    public void purchase(BigDecimal amount){
        qty = qty.add(amount);
    }

}
