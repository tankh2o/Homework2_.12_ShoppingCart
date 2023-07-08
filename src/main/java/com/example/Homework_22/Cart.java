package com.example.Homework_22;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
@SessionScope
public class Cart {
    private final Set<Integer> products = new HashSet<>();

    public Set<Integer> add(List<Integer> ids) {
        products.addAll(ids);
        return products;
    }

    public Set<Integer> get() {
        return new HashSet<>(products);
    }
}
