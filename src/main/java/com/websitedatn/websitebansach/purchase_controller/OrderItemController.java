package com.websitedatn.websitebansach.purchase_controller;

import com.websitedatn.websitebansach.entity.Order;
import com.websitedatn.websitebansach.entity.OrderItem;
import com.websitedatn.websitebansach.purchase_service.OrderItemService;
import com.websitedatn.websitebansach.service.HuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
@RequestMapping("/apiOrderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping("/save")
    public ResponseEntity<OrderItem> addOrderItem(@RequestBody OrderItem orderItem){
        OrderItem orderItemsave = orderItemService.addOrderItem(orderItem);
        return new ResponseEntity<OrderItem>(orderItemsave, HttpStatus.CREATED);
    }

    @GetMapping("/order/{order_id}")
    public ResponseEntity<List<OrderItem>> getOrderItemByOrderId(@PathVariable("order_id") String order_id){

        List<OrderItem> listOfOrderItem =orderItemService.getOrderItemByOrderId(order_id);
        return new ResponseEntity<List<OrderItem>>(listOfOrderItem, HttpStatus.OK);
    }
}
