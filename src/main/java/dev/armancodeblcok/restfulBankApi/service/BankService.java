package dev.armancodeblcok.restfulBankApi.service;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;

import java.util.List;

public interface BankService {
    List<BankAccount> getAllAccounts();

    String addAccount(BankAccount account);

    BankAccount getBankAccountById(Long accountId);


    void removeAccountById(Long accountId);

    void updateBankAccount(Long accountId, BankAccount account);
}
