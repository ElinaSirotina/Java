package com.andersenlab.rmtbanking.creditservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //оптимальная стратегия генерацияя id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Client client;

    @OneToMany(mappedBy = "debitAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Transaction> debitTransactions;
    @OneToMany(mappedBy = "creditAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Transaction> creditTransactions;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Agreement> agreements;
    @Column(name="type")
    private int type;

    @Column(name="status")
    private int status;

    @Column(name="balance")
    private double balance;

    @Column(name="currency_code")
    private int currencyCode;

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;


}
