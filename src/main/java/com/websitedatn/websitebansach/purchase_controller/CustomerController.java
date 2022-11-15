package com.websitedatn.websitebansach.purchase_controller;

import com.websitedatn.websitebansach.entity.Customer;
import com.websitedatn.websitebansach.purchase_service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
@RequestMapping("/apiCustomer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer customersave = customerService.addCustomer(customer);
        return new ResponseEntity<Customer>(customersave, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> listOfAllCus = customerService.getAllCustomer();
        return new ResponseEntity<List<Customer>>(listOfAllCus, HttpStatus.OK);
    }

    /*@GetMapping("/list_email/{cusemail}")
    public ResponseEntity<List<Customer>> getProByCateId(@PathVariable("cusemail") String cusemail){

        List<Customer> listOfCus =customerService.getlistCusByEmail(cusemail);
        return new ResponseEntity<List<Customer>>(listOfCus, HttpStatus.OK);
    }*/

    @GetMapping("/email/{cusemail}")
    public ResponseEntity<Customer> getCusByEmail(@PathVariable("cusemail") String cusemail){
        Customer Cus =customerService.getCusByEmail(cusemail);
        return new ResponseEntity<Customer>(Cus, HttpStatus.OK);
    }

}
