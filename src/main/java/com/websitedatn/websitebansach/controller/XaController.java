package com.websitedatn.websitebansach.controller;


import com.websitedatn.websitebansach.entity.Huyen;
import com.websitedatn.websitebansach.entity.Xa;
import com.websitedatn.websitebansach.service.HuyenService;
import com.websitedatn.websitebansach.service.XaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://astonishing-sunburst-3df6f9.netlify.app")
@RequestMapping("/apiXa")
public class XaController {
    @Autowired
    private XaService xaService;

    @GetMapping("/xa/{huyenId}")
    public ResponseEntity<List<Xa>> getXaByHuyenId(@PathVariable("huyenId") String huyenId){

        List<Xa> listOfXaByHuyenId =xaService.getXaByHuyenId(huyenId);
        return new ResponseEntity<List<Xa>>(listOfXaByHuyenId, HttpStatus.OK);
    }
}
