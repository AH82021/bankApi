package dev.armancodeblcok.restfulBankApi.controller;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;
import dev.armancodeblcok.restfulBankApi.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bank")
public class BankAccountController {
    @Autowired
    BankService bankService;

    // Should all the accounts
    // Http status code 200
    //ResponseBody
    //@RequestMapping(value = "/accounts",method = RequestMethod.GET)
    @GetMapping("/accounts")
    public ResponseEntity<List<BankAccount>> getBankAccounts(){
       List<BankAccount> accountsList = bankService.getAllAccounts();
        return new ResponseEntity<>(accountsList, HttpStatus.OK);
    }

}
