package com.websitedatn.websitebansach.controller;

import com.websitedatn.websitebansach.entity.ProductCategory;
import com.websitedatn.websitebansach.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("hhttps://astonishing-sunburst-3df6f9.netlify.app")
@RequestMapping("/apicate")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @PostMapping("/save-cate")
    public ResponseEntity<ProductCategory> addProductCategory(@RequestBody ProductCategory productCategory){
        ProductCategory productCate = productCategoryService.addProductCategory(productCategory);
        return new ResponseEntity<ProductCategory>(productCate, HttpStatus.CREATED);
    }

    @GetMapping("/all-cate")
    public ResponseEntity<List<ProductCategory>> getAllProductCate(){
        List<ProductCategory> listOfAllProCate = productCategoryService.getAllProductCategory();
        return new ResponseEntity<List<ProductCategory>>(listOfAllProCate, HttpStatus.OK);
    }

    @GetMapping("/procate/{procateid}")
    public ResponseEntity<ProductCategory> getProCateById(@PathVariable("procateid") Long procateidL){

        ProductCategory procateRetrieved = productCategoryService.getProById(procateidL);
        return new ResponseEntity<ProductCategory>(procateRetrieved, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{procateid}")
    public ResponseEntity<Void> deleteProCateById(@PathVariable("procateid") Long procateidL){

        productCategoryService.deleteProCateById(procateidL);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
    @PutMapping("/update")
    public ResponseEntity<ProductCategory> updateProductCategory(@RequestBody ProductCategory productCategory){
        ProductCategory procateSaved = productCategoryService.addProductCategory(productCategory);
        return new ResponseEntity<ProductCategory>(procateSaved, HttpStatus.CREATED);
    }
}
