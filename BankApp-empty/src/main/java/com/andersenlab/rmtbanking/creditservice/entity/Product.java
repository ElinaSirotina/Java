package com.andersenlab.rmtbanking.creditservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name="manager_id")
    private int managerId;

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

    public Product(int managerId, String name, int status, int currencyCode, double interestRate, double sum, int lim, Date createdAt, Date updatedAt) {
        this.managerId = managerId;
        this.name = name;
        this.status = status;
        this.currencyCode = currencyCode;
        this.interestRate = interestRate;
        this.sum = sum;
        this.lim = lim;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}

