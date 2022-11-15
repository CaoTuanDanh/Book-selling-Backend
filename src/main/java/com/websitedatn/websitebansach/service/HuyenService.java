package com.websitedatn.websitebansach.service;


import com.websitedatn.websitebansach.entity.Huyen;

import java.util.List;

public interface HuyenService {

    public List<Huyen> getHuyenByTinhthanhId(String tinhthanhId);
}
