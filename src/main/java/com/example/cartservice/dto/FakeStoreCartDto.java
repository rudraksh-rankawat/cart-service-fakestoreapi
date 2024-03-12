package com.example.cartservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.*;


@Getter
@Setter
class ProductDto {
    private Integer productId;

    private Integer quantity;
}

@Getter
@Setter
public class FakeStoreCartDto {
    private Long id;

    private Long userId;

    private String date;

    private List<ProductDto> products;
}


