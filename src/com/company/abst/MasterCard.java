package com.company.abst;

public class MasterCard implements BankCard {
    @Override
    public String getCardHolderName() {
        return null;
    }

    @Override
    public Long getCardNumber() {
        return null;
    }

    public int getHolderCash() {
        return 12;
    }
}
