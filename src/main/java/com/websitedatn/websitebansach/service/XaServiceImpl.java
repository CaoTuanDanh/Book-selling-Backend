package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.dao.XaRepository;
import com.websitedatn.websitebansach.entity.Xa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XaServiceImpl implements XaService{

    @Autowired
    private XaRepository xaRepository;

    @Override
    public List<Xa> getXaByHuyenId(String huyenId) {
        if (huyenId != null) {
            return xaRepository.findAllById(huyenId);
        }
        return xaRepository.findAll();
    }
}
