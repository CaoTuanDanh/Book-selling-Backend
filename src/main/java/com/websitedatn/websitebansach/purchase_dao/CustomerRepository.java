package com.websitedatn.websitebansach.purchase_dao;

import com.websitedatn.websitebansach.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("SELECT p FROM Customer p WHERE CONCAT(p.email) LIKE %?1%")
    public List<Customer> findAllByEmail(String keyword);

    //@Query("SELECT p FROM Customer p WHERE LOWER(p.email)=LOWER(:q)")
    @Query("SELECT p FROM Customer p WHERE CONCAT(p.email) LIKE %?1%")
    Customer findByEmailOrName(@Param("q") String q);


}
