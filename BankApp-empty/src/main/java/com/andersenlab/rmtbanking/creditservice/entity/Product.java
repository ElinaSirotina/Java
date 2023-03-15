package com.andersenlab.rmtbanking.creditservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private Manager manager;

    @OneToMany(mappedBy = "product", cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Agreement> agreements;

    @Column(name="name")
    private String name;

    @Column(name="status")
    private int status;

    @Column(name="currency_code")
    private int currencyCode;

    @Column(name="interest_rate")
    private double interestRate;

    @Column(name="sum")
    private double sum;

    @Column(name="lim")
    private int lim;

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;


}

