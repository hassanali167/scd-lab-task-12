package com.designpatterns.demo.facade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

    private BankingFacade bankingFacade = new BankingFacade();

    @GetMapping("/balance")
    public String checkBalance() {
        bankingFacade.checkBalance();
        return "Balance checked. See logs.";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        bankingFacade.deposit(amount);
        return "Deposited " + amount;
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount) {
        bankingFacade.withdraw(amount);
        return "Withdrawn " + amount;
    }
}
