package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.entity.Xa;

import java.util.List;

public interface XaService {

    public List<Xa> getXaByHuyenId(String huyenId);
}
