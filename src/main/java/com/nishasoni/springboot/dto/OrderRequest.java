package com.nishasoni.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import com.nishasoni.springboot.entity.Order;
import com.nishasoni.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
