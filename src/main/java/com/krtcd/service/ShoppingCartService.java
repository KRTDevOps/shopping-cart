package com.krtcd.service;

import java.math.BigDecimal;
import java.util.Map;

import com.krtcd.exception.NotEnoughProductsInStockException;
import com.krtcd.model.Product;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
