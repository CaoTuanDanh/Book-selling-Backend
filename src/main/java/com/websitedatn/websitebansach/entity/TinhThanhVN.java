package com.websitedatn.websitebansach.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tinhthanhVN")
@Getter
@Setter
@ToString
public class TinhThanhVN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="tinhthanh_id")
    private int tinhthanh_id;

    @Column(name="name")
    private String name;
}
