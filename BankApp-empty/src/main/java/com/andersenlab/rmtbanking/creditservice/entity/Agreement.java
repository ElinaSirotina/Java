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
@Table(name="agreement")
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="account_id")
    private int accountId;

    @Column(name="product_id")
    private int productId;

    @Column(name="interest_rate")
    private double interestRate;

    @Column(name="status")
    private int status;

    @Column(name="sum")
    private double sum;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

}
