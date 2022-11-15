package com.websitedatn.websitebansach.controller;

import com.websitedatn.websitebansach.entity.Huyen;
import com.websitedatn.websitebansach.service.HuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/apiHuyen")
public class HuyenController {
    @Autowired
    private HuyenService huyenService;

    @GetMapping("/huyen/{tinhId}")
    public ResponseEntity<List<Huyen>> getHuyenByTinhthanhId(@PathVariable("tinhId") String tinhId){

        List<Huyen> listOfHuyenBytinhId =huyenService.getHuyenByTinhthanhId(tinhId);
        return new ResponseEntity<List<Huyen>>(listOfHuyenBytinhId, HttpStatus.OK);
    }

}
