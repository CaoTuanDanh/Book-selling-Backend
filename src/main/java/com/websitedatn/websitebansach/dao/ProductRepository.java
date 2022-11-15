package com.websitedatn.websitebansach.dao;

import com.websitedatn.websitebansach.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE CONCAT(p.category_id) LIKE %?1%")
    public List<Product> findAllById(String keyword);

    @Query("SELECT p FROM Product p WHERE CONCAT(p.name) LIKE %?1%")
    public List<Product> findAllByName(String keyword);

}
