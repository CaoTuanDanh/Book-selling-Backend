package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Customer;
import com.websitedatn.websitebansach.purchase_dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        Customer savecustomer= customerRepository.save(customer);
        return savecustomer;
    }
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getlistCusByEmail(String cusemail) {
        if (cusemail != null) {
            return customerRepository.findAllByEmail(cusemail);
        }
        return customerRepository.findAll();
    }

    @Override
    public Customer getCusByEmail(String cusemail) {
        if (cusemail != null) {
            return customerRepository.findByEmailOrName(cusemail);
        }
        return customerRepository.findByEmailOrName(cusemail);
    }

    @Override
    public Customer getCusById(Long cusidL) {
        return customerRepository.findById(cusidL).get();
    }

}
