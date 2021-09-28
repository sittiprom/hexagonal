package com.example.hexagonal.services;

import com.example.hexagonal.domain.Product;
import com.example.hexagonal.incoming.PurchaseProduct;
import com.example.hexagonal.incoming.SaleProduct;
import com.example.hexagonal.outgoing.LoadProduct;
import com.example.hexagonal.outgoing.SaveProduct;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

public class ProductService  implements PurchaseProduct, SaleProduct {

    private LoadProduct loadProduct;
    private SaveProduct saveProduct;

    public ProductService(LoadProduct loadProduct,SaveProduct saveProduct){
        this.loadProduct = loadProduct;
        this.saveProduct = saveProduct;

    }

    @Override
    public void purchase(Integer id, BigDecimal amount) {
        Product product = loadProduct.load(id).orElseThrow(NoSuchElementException::new);
        product.purchase(amount);
        saveProduct.save(product);

    }

    @Override
    public boolean sale(Integer id, BigDecimal amount) {
        Product product = loadProduct.load(id).orElseThrow(NoSuchElementException::new);
        boolean hasProduct = product.sale(amount);
        if(hasProduct){
            saveProduct.save(product);
        }
        return hasProduct;
    }
}
