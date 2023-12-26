package com.nishasoni.springboot.service;

import com.nishasoni.springboot.dto.OrderRequest;
import com.nishasoni.springboot.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
