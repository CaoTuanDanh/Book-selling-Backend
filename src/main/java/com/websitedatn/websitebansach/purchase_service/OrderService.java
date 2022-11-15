package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Order;

import java.util.List;

public interface OrderService {
    public Order addOrder(Order order);

    public List<Order> getOrderByCusId(String orderbycusidL);

}
