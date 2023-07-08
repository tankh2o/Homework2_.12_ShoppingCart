package com.example.Homework_22;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartInterface cartInterface;

    public CartController(CartInterface cartInterface) {
        this.cartInterface = cartInterface;
    }

    @GetMapping(path = "/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return cartInterface.add(ids);
    }

    @GetMapping(path = "/get")
    public Set<Integer> get() {
        return cartInterface.get();
    }
}
