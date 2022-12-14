package com.websitedatn.websitebansach.controller;

import com.websitedatn.websitebansach.entity.TinhThanhVN;
import com.websitedatn.websitebansach.service.TinhthanhVNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://book-selling-dtshop.netlify.app")
@RequestMapping("/apiTinhthanh")
public class TinhthanhVNController {

    @Autowired
    private TinhthanhVNService tinhthanhVNService;

    @GetMapping("/all")
    public ResponseEntity<List<TinhThanhVN>> getAllTinhThanh(){
        List<TinhThanhVN> listOfAllTinhthanh = tinhthanhVNService.getAllTinhthanh();
        return new ResponseEntity<List<TinhThanhVN>>(listOfAllTinhthanh, HttpStatus.OK);
    }

    @GetMapping("/tinhthanh/{tinhId}")
    public ResponseEntity<TinhThanhVN> getTinhthanhById(@PathVariable("tinhId") Integer tinhId){

        TinhThanhVN tinhthanhRetrieved = tinhthanhVNService.getTinhthanhById(tinhId);
        return new ResponseEntity<TinhThanhVN>(tinhthanhRetrieved, HttpStatus.OK);
    }
}
