package com.websitedatn.websitebansach.purchase_dao;

import com.websitedatn.websitebansach.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://book-selling-dtshop.netlify.app")
public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query("SELECT p FROM Order p WHERE CONCAT(p.customer_id) LIKE %?1%")
    public List<Order> findAllByCusId(String keyword);
}
