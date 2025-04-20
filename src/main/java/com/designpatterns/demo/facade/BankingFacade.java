package com.designpatterns.demo.facade;

public class BankingFacade {
    private Deposit deposit;

    public BankingFacade() {
        this.deposit = new Deposit();
    }

    public void deposit(double amount) {
        deposit.depositMoney(amount);
    }
}
