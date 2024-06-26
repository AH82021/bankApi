package dev.armancodeblcok.restfulBankApi.service;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;
import dev.armancodeblcok.restfulBankApi.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Override
    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }

    @Override
    public String addAccount(BankAccount account) {
     bankAccountRepository.save(account);

        return "account added successfully";

    }

    @Override
    public BankAccount getBankAccountById(Long accountId) {

       Optional<BankAccount> accountOptional = bankAccountRepository.findById(accountId);

       if(accountOptional.isPresent()){
           return  accountOptional.get();
       }

       throw new IllegalArgumentException("Account with id " + accountId + " does not exist");

    }

    @Override
    public void removeAccountById(Long accountId) {

        bankAccountRepository.deleteById(accountId);

    }

    @Override
    public void updateBankAccount(Long accountId, BankAccount account) {
        Optional<BankAccount> accountOptional = bankAccountRepository.findById(accountId);

        if(accountOptional.isPresent()){
            accountOptional.get().setAccountNumber(account.getAccountNumber());
            accountOptional.get().setAccountHolderName(account.getAccountHolderName());
            accountOptional.get().setBalance(account.getBalance());

            bankAccountRepository.save(accountOptional.get());


        }

    }
}
