package com.example.Homework_22;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class CartService implements CartInterface {
    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Set<Integer> add(List<Integer> ids) {
        return cart.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return cart.get();
    }

}
