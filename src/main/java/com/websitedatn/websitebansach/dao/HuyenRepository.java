package com.websitedatn.websitebansach.dao;


import com.websitedatn.websitebansach.entity.Huyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface HuyenRepository extends JpaRepository<Huyen, Integer> {
    @Query("SELECT p FROM Huyen p WHERE CONCAT(p.tinhthanh_id) LIKE %?1%")
    public List<Huyen> findAllById(String keyword);


}