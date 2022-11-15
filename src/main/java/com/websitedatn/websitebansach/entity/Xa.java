package com.websitedatn.websitebansach.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="xa")
@Getter
@Setter
@ToString
public class Xa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="xa_id")
    private int xa_id;

    @Column(name="name")
    private String name;

    @Column(name="huyen_id")
    private int huyen_id;
}
