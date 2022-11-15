package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.entity.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProById(Long proidL);

    public List<Product> getProByCateId(String procateidL);

    public List<Product> getProByCateName(String name);

    public void deleteProById(Long proidL);
}
