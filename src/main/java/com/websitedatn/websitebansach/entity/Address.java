package com.websitedatn.websitebansach.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shipping_address_id")
    private Long shipping_address_id;

    @Column(name="dia_chi")
    private String dia_chi;

    @Column(name="huyen")
    private String huyen;

    @Column(name="tinhthanh")
    private String tinhthanh;

    @Column(name="xa")
    private String xa;

    @Column(name="order_id")
    private Long order_id;

}
