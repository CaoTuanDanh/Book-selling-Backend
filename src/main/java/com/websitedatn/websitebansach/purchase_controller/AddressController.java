package com.websitedatn.websitebansach.purchase_controller;


import com.websitedatn.websitebansach.entity.Address;
import com.websitedatn.websitebansach.purchase_service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/apiAddress")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/save")
    public ResponseEntity<Address> addAddress(@RequestBody Address address){
        Address addresssave = addressService.addAddress(address);
        return new ResponseEntity<Address>(addresssave, HttpStatus.CREATED);
    }

    @GetMapping("/order/{order_id}")
    public ResponseEntity<Address> getAddByOrderId(@PathVariable("order_id") String order_id){

        Address address =addressService.getAddressByOrderId(order_id);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }

}
