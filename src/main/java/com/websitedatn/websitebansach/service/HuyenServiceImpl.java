package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.dao.HuyenRepository;
import com.websitedatn.websitebansach.entity.Huyen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuyenServiceImpl implements HuyenService{

    @Autowired
    private HuyenRepository huyenRepository;

    @Override
    public List<Huyen> getHuyenByTinhthanhId(String tinhthanhId) {
        if (tinhthanhId != null) {
            return huyenRepository.findAllById(tinhthanhId);
        }
        return huyenRepository.findAll();
    }
}
