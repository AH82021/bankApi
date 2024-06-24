package dev.armancodeblcok.restfulBankApi.service;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;

import java.util.List;

public interface BankService {
    List<BankAccount> getAllAccounts();
}
