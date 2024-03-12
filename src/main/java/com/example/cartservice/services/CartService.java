package com.example.cartservice.services;

import com.example.cartservice.dto.FakeStoreCartDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@Service
public class CartService {
    RestTemplate restTemplate = new RestTemplate();
    String url= "https://fakestoreapi.com/";

    public List<FakeStoreCartDto> getAllCarts() {
        FakeStoreCartDto[] response = restTemplate.getForObject(url + "/carts/", FakeStoreCartDto[].class);
        return Arrays.asList(response);
    }

    public FakeStoreCartDto getCartById(Long id){
        FakeStoreCartDto response = restTemplate.getForObject(url + "/carts/" + id, FakeStoreCartDto.class);
        return response;
    }

    public List<FakeStoreCartDto> getUserCart(Long id){
        FakeStoreCartDto[] response = restTemplate.getForObject(url + "/carts/user/" + id, FakeStoreCartDto[].class);
        return Arrays.asList(response);
    }

}





