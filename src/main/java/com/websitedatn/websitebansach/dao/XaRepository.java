package com.websitedatn.websitebansach.dao;

import com.websitedatn.websitebansach.entity.Huyen;
import com.websitedatn.websitebansach.entity.Xa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://book-selling-dtshop.netlify.app")
public interface XaRepository extends JpaRepository<Xa, Integer> {

    @Query("SELECT p FROM Xa p WHERE CONCAT(p.huyen_id) LIKE %?1%")
    public List<Xa> findAllById(String keyword);
}
