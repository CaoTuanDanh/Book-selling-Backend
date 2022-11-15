package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Address;
import com.websitedatn.websitebansach.purchase_dao.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        Address saveaddress= addressRepository.save(address);
        return saveaddress;
    }

    @Override
    public Address getAddressByOrderId(String addbyorderidL) {
        if (addbyorderidL != null) {
            return addressRepository.findByOrderId(addbyorderidL);
        }
        return null;
    }
}
