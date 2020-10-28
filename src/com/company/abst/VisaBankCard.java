package com.company.abst;

public class VisaBankCard implements BankCard {
    @Override
    public String getCardHolderName() {
        return "fasf";
    }

    @Override
    public Long getCardNumber() {
        return 524_671_284_124L;
    }
}
