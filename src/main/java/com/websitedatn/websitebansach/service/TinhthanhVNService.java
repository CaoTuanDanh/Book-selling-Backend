package com.websitedatn.websitebansach.service;

import com.websitedatn.websitebansach.entity.TinhThanhVN;

import java.util.List;

public interface TinhthanhVNService {

    public List<TinhThanhVN> getAllTinhthanh();

    public TinhThanhVN getTinhthanhById(Integer tinhId);

}
