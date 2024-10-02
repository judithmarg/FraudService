package com.example.FraudService;

public class BlackCredit {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public boolean isBlackStill() {
        return isBlackStill;
    }

    public void setBlackStill(boolean blackStill) {
        isBlackStill = blackStill;
    }

    private String number;
    private String bank;
    private boolean isBlackStill;

    public BlackCredit(String number, String bank, boolean isBlackStill) {
        this.number = number;
        this.bank = bank;
        this.isBlackStill = isBlackStill;
    }
}
