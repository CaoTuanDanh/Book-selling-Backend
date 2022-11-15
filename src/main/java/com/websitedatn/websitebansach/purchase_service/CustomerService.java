package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);

    public Customer getCusById(Long cusidL);

    public List<Customer> getAllCustomer();

    public List<Customer> getlistCusByEmail(String cusemail);


    public Customer getCusByEmail(String cusemail);
}
