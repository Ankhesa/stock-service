package com.bigp.stockservice.controller;

import com.bigp.stockservice.domain.StockResponse;
import com.bigp.stockservice.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping(value = "/stock/{productId}")
    public ResponseEntity<StockResponse> getStockByProductId(@PathVariable(value = "productId") Long productId){
        return new ResponseEntity<>(stockService.getStockByProductId(productId), HttpStatus.OK);
    }
}
