package com.example.webpos.biz;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Product;

import java.util.List;

public interface PosService {
    public Cart getCart();

    public Cart newCart();

    public void checkout();

    public double getTotal();

    public boolean add(Product product, int amount);

    public boolean add(String productId, int amount);

    public boolean remove(Product product);

    public boolean remove(String productId);

    public List<Product> products();

}
