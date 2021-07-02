package com.bigp.stockservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockResponse {
    private Long id;
    private Long productId;
    private int quantity;
}
