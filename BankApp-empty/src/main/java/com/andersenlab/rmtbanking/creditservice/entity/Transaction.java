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
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name="debet_account_id")
    private int debitAccountId;

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name="credit_account_id")
    private int creditAccountId;

    @Column(name="type")
    private String type;

    @Column(name="ammount")
    private double amount;

    @Column(name="description")
    private String desctiption;

    @Column(name="created_at")
    private Date createdAt;

    public Transaction(int debitAccountId, int creditAccountId, String type, double amount, String desctiption, Date createdAt) {
        this.debitAccountId = debitAccountId;
        this.creditAccountId = creditAccountId;
        this.type = type;
        this.amount = amount;
        this.desctiption = desctiption;
        this.createdAt = createdAt;
    }

}
