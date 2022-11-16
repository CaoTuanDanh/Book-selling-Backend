package com.websitedatn.websitebansach.purchase_dao;

import com.websitedatn.websitebansach.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://book-selling-dtshop.netlify.app")
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

    @Query("SELECT p FROM OrderItem p WHERE CONCAT(p.order_id) LIKE %?1%")
    public List<OrderItem> findAllByOrderId(String keyword);
}
