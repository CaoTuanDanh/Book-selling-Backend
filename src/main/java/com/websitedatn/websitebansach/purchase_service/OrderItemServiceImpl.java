package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.OrderItem;
import com.websitedatn.websitebansach.purchase_dao.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService{

    @Autowired
    private OrderItemRepository orderItemRepository;
    @Override
    public OrderItem addOrderItem(OrderItem orderItem) {
        OrderItem saveorderitem= orderItemRepository.save(orderItem);
        return saveorderitem;
    }

    @Override
    public List<OrderItem> getOrderItemByOrderId(String orderitembyorderidL) {
        if (orderitembyorderidL != null) {
            return orderItemRepository.findAllByOrderId(orderitembyorderidL);
        }
        return orderItemRepository.findAll();
    }
}
