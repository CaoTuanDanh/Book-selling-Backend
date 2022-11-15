package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    public OrderItem addOrderItem(OrderItem orderItem);

    public List<OrderItem> getOrderItemByOrderId(String orderitembyorderidL);


}
