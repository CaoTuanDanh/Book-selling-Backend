package com.websitedatn.websitebansach.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="product_category")
@Getter
@Setter
@ToString
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private String id;

    @Column(name = "category_id")
    private String category_id;

    @Column(name = "category_name")
    private String categoryName;


}







