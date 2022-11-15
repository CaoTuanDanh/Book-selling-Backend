package com.websitedatn.websitebansach.purchase_service;

import com.websitedatn.websitebansach.entity.Address;

public interface AddressService {

    public Address addAddress(Address address);

    public Address getAddressByOrderId(String addbyorderidL);
}
