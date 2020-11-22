package com.knowledgehut.banking;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionService {
    List<Transaction> transactionList;

    public TransactionService(List<Transaction> transactions){
        this.transactionList = transactions;
    }

    public List<Transaction> findAllByAccountNumber(Long accountNumber) {
        return transactionList.stream()
                .filter(transaction -> transaction.accountNumber.equals(accountNumber)).collect(Collectors.toList());
    }
}
