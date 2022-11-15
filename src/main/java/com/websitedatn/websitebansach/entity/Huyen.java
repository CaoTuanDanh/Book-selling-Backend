package com.websitedatn.websitebansach.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="huyen")
@Getter
@Setter
@ToString

public class Huyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="huyen_id")
    private int huyen_id;

    @Column(name="name")
    private String name;

    @Column(name="tinhthanh_id")
    private int tinhthanh_id;

}
