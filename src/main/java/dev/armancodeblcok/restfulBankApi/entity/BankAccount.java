package dev.armancodeblcok.restfulBankApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*
CREATE TABLE IF NOT EXISTS
BankAccount (
INT id primary key auto increment;
)
 */

@Entity  // 1-  mapped object to table
public  class BankAccount {
    @Id  // 2- choose the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // based on the database mysql,postgres,oracledb
    private Long id;

    private String accountNumber;
    private String accountHolderName;
    private double balance;
// 3- create no-argument constructor
    public BankAccount() {
    }

    public BankAccount(double balance, String accountHolderName, String accountNumber) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
