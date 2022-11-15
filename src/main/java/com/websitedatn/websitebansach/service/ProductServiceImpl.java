package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.dao.ProductRepository;
import com.websitedatn.websitebansach.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        Product saveproduct= productRepository.save(product);
        return saveproduct;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProById(Long proidL) {
        return productRepository.findById(proidL).get();
    }

    @Override
    public List<Product> getProByCateId(String procateidL) {
        if (procateidL != null) {
            return productRepository.findAllById(procateidL);
        }
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProByCateName(String name) {
        if (name != null) {
            return productRepository.findAllByName(name);
        }
        return productRepository.findAll();
    }

    @Override
    public void deleteProById(Long proidL) {
        productRepository.deleteById(proidL);
    }
}
