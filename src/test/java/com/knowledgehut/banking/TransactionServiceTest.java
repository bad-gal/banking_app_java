package com.knowledgehut.banking;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TransactionServiceTest {
    private final List<Transaction> transactions = new ArrayList<>();

    @Test
    void findAllByAccountNumber() {
       transactions.add(new Transaction("a", 12345L, "GBP", 5, "some-merchant", (byte) 0));

       TransactionService transactionService = new TransactionService(transactions);

       assertThat(transactionService.findAllByAccountNumber(12345L).size()).isEqualTo(1);
    }
}
