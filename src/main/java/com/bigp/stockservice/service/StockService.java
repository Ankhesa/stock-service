package com.bigp.stockservice.service;

import com.bigp.stockservice.domain.Stock;
import com.bigp.stockservice.domain.StockResponse;
import com.bigp.stockservice.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public StockResponse getStockByProductId(Long productId){
        Stock stock= stockRepository.getStockByIdProduct(productId);
        return new StockResponse(stock.getId(),stock.getProductId(),stock.getQuantity());
    }
}
