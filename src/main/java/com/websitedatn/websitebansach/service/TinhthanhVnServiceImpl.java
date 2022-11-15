package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.dao.TinhThanhVNRepository;
import com.websitedatn.websitebansach.entity.TinhThanhVN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TinhthanhVnServiceImpl implements TinhthanhVNService {

    @Autowired
    private TinhThanhVNRepository tinhThanhVNRepository;

    @Override
    public List<TinhThanhVN> getAllTinhthanh() {
        return tinhThanhVNRepository.findAll();
    }

    @Override
    public TinhThanhVN getTinhthanhById(Integer tinhId) {
        return tinhThanhVNRepository.findById(tinhId).get();
    }

}
