package com.websitedatn.websitebansach.service;


import com.websitedatn.websitebansach.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    public ProductCategory addProductCategory(ProductCategory productCategory);

    public List<ProductCategory> getAllProductCategory();

    public ProductCategory getProById(Long procateidL);

    public void deleteProCateById(Long procateidL);
}
