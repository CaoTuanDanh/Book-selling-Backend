package com.websitedatn.websitebansach.service;


import com.websitedatn.websitebansach.dao.ProductCategoryRepository;
import com.websitedatn.websitebansach.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory addProductCategory(ProductCategory productCategory) {
        ProductCategory saveproductcategory = productCategoryRepository.save(productCategory);
        return saveproductcategory;
    }

    @Override
    public List<ProductCategory> getAllProductCategory() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory getProById(Long procateidL) {
        return productCategoryRepository.findById(procateidL).get();
    }

    @Override
    public void deleteProCateById(Long procateidL) {

        productCategoryRepository.deleteById(procateidL);

    }
}
