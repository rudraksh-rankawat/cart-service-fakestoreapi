package com.example.cartservice.controller;

import com.example.cartservice.dto.FakeStoreCartDto;
import com.example.cartservice.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class CartController {

    CartService cs;
    CartController(CartService cs) {
        this.cs = cs;
    }


    @GetMapping("/carts/")
    public List<FakeStoreCartDto> getAllCarts() {
        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}/")
    public FakeStoreCartDto getCartsById(@PathVariable Long id) {
        return cs.getCartById(id);
    }

    @GetMapping("/carts/user/{id}/")
    public List<FakeStoreCartDto> getUserCart(@PathVariable Long id) {
        return cs.getUserCart(id);
    }


}

