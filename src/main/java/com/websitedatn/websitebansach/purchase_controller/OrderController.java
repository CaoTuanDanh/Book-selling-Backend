package com.websitedatn.websitebansach.purchase_controller;

import com.websitedatn.websitebansach.entity.Order;
import com.websitedatn.websitebansach.purchase_service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
@RequestMapping("/apiOrder")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        Order ordersave = orderService.addOrder(order);
        return new ResponseEntity<Order>(ordersave, HttpStatus.CREATED);
    }

    @GetMapping("/customer/{cus_id}")
    public ResponseEntity<List<Order>> getOrderByCusId(@PathVariable("cus_id") String cus_id){

        List<Order> listOfOrder =orderService.getOrderByCusId(cus_id);
        return new ResponseEntity<List<Order>>(listOfOrder, HttpStatus.OK);
    }

}
