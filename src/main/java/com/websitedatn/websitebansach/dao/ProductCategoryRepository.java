package com.websitedatn.websitebansach.dao;

import com.websitedatn.websitebansach.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
