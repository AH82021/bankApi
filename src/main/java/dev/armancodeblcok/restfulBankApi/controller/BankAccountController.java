package dev.armancodeblcok.restfulBankApi.controller;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;
import dev.armancodeblcok.restfulBankApi.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

@GetMapping("/accounts/{accountId}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable Long accountId){

        return new ResponseEntity<>(bankService.getBankAccountById(accountId),HttpStatus.OK);

    }


    //
    @PostMapping("/addAccount")
    public ResponseEntity<String> addBankAccount(@RequestBody BankAccount account){


        return new ResponseEntity<>(bankService.addAccount(account),HttpStatus.CREATED);

    }

@DeleteMapping("/remove/{accountId}")
    public ResponseEntity<Void> removeAccountById( @PathVariable Long accountId){

        bankService.removeAccountById(accountId);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update/{accountId}")
public ResponseEntity<BankAccount>  updateBankAccount( @PathVariable Long accountId, @RequestBody BankAccount account) {

        bankService.updateBankAccount(accountId,account);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);

}















}
