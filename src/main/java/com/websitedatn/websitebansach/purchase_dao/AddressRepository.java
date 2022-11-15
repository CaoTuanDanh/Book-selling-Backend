package com.websitedatn.websitebansach.purchase_dao;


import com.websitedatn.websitebansach.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query("SELECT p FROM Address p WHERE CONCAT(p.order_id) LIKE %?1%")
    public Address findByOrderId(String keyword);
}
