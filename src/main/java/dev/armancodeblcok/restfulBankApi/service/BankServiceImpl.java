package dev.armancodeblcok.restfulBankApi.service;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;
import dev.armancodeblcok.restfulBankApi.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }
}
