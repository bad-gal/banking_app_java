package com.knowledgehut.banking;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TransactionTest {
    private final Transaction transaction = new Transaction("type", 12345l, "GBP", 4, "merchant-name", (byte) 0);

    @Test
    void getType() {
        assert(transaction.getType()).equals("type");
    }

    @Test
    void setType() {
        transaction.setType("null");
        assertThat(transaction.getType()).isEqualTo("null");
    }

    @Test
    void getAccountNumber() {
        assertThat(transaction.getAccountNumber()).isEqualTo(12345L);
    }

    @Test
    void setAccountNumber() {
        transaction.setAccountNumber(654321L);
        assertThat(transaction.getAccountNumber()).isEqualTo(654321L);
    }

    @Test
    void getCurrency() {
        assertThat(transaction.getCurrency()).isEqualTo("GBP");
    }

    @Test
    void setCurrency() {
        transaction.setCurrency("USD");
        assertThat(transaction.getCurrency()).isEqualTo("USD");
    }

    @Test
    void getAmount() {
        assertThat(transaction.getAmount()).isEqualTo(4);
    }

    @Test
    void setAmount() {
        transaction.setAmount(10);
        assertThat(transaction.getAmount()).isEqualTo(10);
    }

    @Test
    void getMerchantName() {
        assertThat(transaction.getMerchantName()).isEqualTo("merchant-name");
    }

    @Test
    void setMerchantName() {
        transaction.setMerchantName("Andrien");
        assertThat(transaction.getMerchantName()).isEqualTo("Andrien");
    }

    @Test
    void getMerchantLogo() {
        assertThat(transaction.getMerchantLogo()).isEqualTo((byte)0);
    }

    @Test
    void setMerchantLogo() {
        transaction.setMerchantLogo((byte)5);
        assertThat(transaction.getMerchantLogo()).isEqualTo((byte)5);
    }
}