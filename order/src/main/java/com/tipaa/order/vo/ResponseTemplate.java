package com.tipaa.order.vo;

import com.tipaa.order.model.Order;

import lombok.Data;

@Data
public class ResponseTemplate {
    Order order;
    Produk produk;
    
}
