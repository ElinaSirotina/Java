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
    private Long id;

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

    @Column(name="limit")
    private int limit;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

}
