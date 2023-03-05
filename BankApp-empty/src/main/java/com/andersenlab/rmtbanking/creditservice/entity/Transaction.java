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
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="debit_account_id")
    private Long debitAccountId;

    @Column(name="cebit_account_id")
    private Long creditAccountId;

    @Column(name="type")
    private String type;

    @Column(name="amount")
    private double amount;

    @Column(name="description")
    private String desctiption;

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
