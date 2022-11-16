package com.websitedatn.websitebansach.dao;

import com.websitedatn.websitebansach.entity.TinhThanhVN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("https://book-selling-dtshop.netlify.app")
public interface TinhThanhVNRepository extends JpaRepository<TinhThanhVN, Integer> {

}
