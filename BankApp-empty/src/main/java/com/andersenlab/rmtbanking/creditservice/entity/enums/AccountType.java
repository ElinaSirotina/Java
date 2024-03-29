package com.andersenlab.rmtbanking.creditservice.entity.enums;

public enum AccountType {
    CREDIT(1),
    DEPOSIT(2),
    CURRENT(3);
    private final int value;

    AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
