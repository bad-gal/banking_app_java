package com.knowledgehut.banking;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {

    @GetMapping("/transactions/{accountNumber}")
    public ResponseEntity<List<Transaction>> transactionsByAccount(@PathVariable("accountNumber") Long accountNumber) {
        // create an empty arrayList of Transactions
        List<Transaction> transactionList = new ArrayList<>();

        // create a couple of transactions
        Transaction trans = new Transaction("deposit", 12345L, "GBP", 50, "some-merchant", (byte) 0);
        Transaction trans2 = new Transaction("withdrawl", 12345L, "GBP", 14, "some-merchant", (byte) 0);

        // add transactions to the arrayList
        transactionList.add(trans);
        transactionList.add(trans2);

        // create a new TransactionService that takes a list of transactions
        TransactionService transactionService = new TransactionService(transactionList);

        // return transactions that match the account number
        return new ResponseEntity<>(transactionService.findAllByAccountNumber(accountNumber), HttpStatus.OK);
    }
}
