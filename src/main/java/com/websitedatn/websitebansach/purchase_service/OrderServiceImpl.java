package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Order;
import com.websitedatn.websitebansach.purchase_dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order addOrder(Order order) {
        String orderTrackingNumber = generateOrderTrackingNumber();
        Order saveorder = new Order();
        saveorder = order;

        saveorder.setOrderTrackingNumber(orderTrackingNumber);
        return orderRepository.save(saveorder);
    }

    @Override
    public List<Order> getOrderByCusId(String orderbycusidL) {
        if (orderbycusidL != null) {
            return orderRepository.findAllByCusId(orderbycusidL);
        }
        return orderRepository.findAll();
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
        //
        return UUID.randomUUID().toString();
    }
}
