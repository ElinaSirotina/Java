package com.andersenlab.rmtbanking.creditservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //оптимальная стратегия генерацияя id
    private Long id;

    @Column(name="clientId")
    private Long clientId;

    @Column(name="type")
    private int type;

    @Column(name="status")
    private int status;

    @Column(name="balance")
    private double balance;

    @Column(name="currency_code")
    private int currencyCode;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updatedAt")
    private Date updatedAt;

}
