package com.websitedatn.websitebansach.controller;

import com.websitedatn.websitebansach.entity.Product;
import com.websitedatn.websitebansach.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product productsave = productService.addProduct(product);
        return new ResponseEntity<Product>(productsave, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> listOfAllPro = productService.getAllProduct();
        return new ResponseEntity<List<Product>>(listOfAllPro, HttpStatus.OK);
    }

    @GetMapping("/pro/{proid}")
    public ResponseEntity<Product> getProById(@PathVariable("proid") Long proidL){

        Product proRetrieved = productService.getProById(proidL);
        return new ResponseEntity<Product>(proRetrieved, HttpStatus.OK);
    }

    @GetMapping("/procate/{procateid}")
    public ResponseEntity<List<Product>> getProByCateId(@PathVariable("procateid") String procateidL){

        List<Product> listOfCate =productService.getProByCateId(procateidL);
        return new ResponseEntity<List<Product>>(listOfCate, HttpStatus.OK);
    }

    @GetMapping("/proname/{name}")
    public ResponseEntity<List<Product>> getProByCateName(@PathVariable("name") String name){

        List<Product> listOfName =productService.getProByCateName(name);
        return new ResponseEntity<List<Product>>(listOfName, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{proid}")
    public ResponseEntity<Void> deleteProById(@PathVariable("proid") Long proidL){

        productService.deleteProById(proidL);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product employeeSaved = productService.addProduct(product);
        return new ResponseEntity<Product>(employeeSaved, HttpStatus.CREATED);
    }

}
