package com.example.demo.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdatePriceRequest {
    private BigDecimal newPrice;
}