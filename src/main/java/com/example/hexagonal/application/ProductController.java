package com.example.hexagonal.application;

import com.example.hexagonal.incoming.PurchaseProduct;
import com.example.hexagonal.incoming.SaleProduct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
@RequestMapping("/product")
public class ProductController {
    private final PurchaseProduct purchaseProduct;
    private final SaleProduct saleProduct;

    public ProductController(PurchaseProduct purchaseProduct, SaleProduct saleProduct) {
        this.purchaseProduct = purchaseProduct;
        this.saleProduct = saleProduct;
    }

    @PostMapping(value = "/{id}/purchase/{amount}")
    void purchase(@PathVariable final Integer id, @PathVariable final BigDecimal amount) {
        purchaseProduct.purchase(id,amount);

    }

    @PostMapping(value = "/{id}/sale/{amount}")
    void sale(@PathVariable final Integer id, @PathVariable final BigDecimal amount) {
        saleProduct.sale(id,amount);

    }
}
