package com.knowledgehut.banking;

public class Transaction {
    String type;
    Long accountNumber;
    String currency;
    int amount;
    String merchantName;
    Byte merchantLogo;

    public Transaction(String type, Long accountNumber, String currency, int amount, String merchantName, Byte merchantLogo) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Byte getMerchantLogo() {
        return merchantLogo;
    }

    public void setMerchantLogo(Byte merchantLogo) {
        this.merchantLogo = merchantLogo;
    }
}
