package com.legacybanking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BankingController {

    @Autowired
    private BankingService service;

    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(@RequestParam String name, @RequestParam Double balance) {
        Account account = service.createAccount(name, balance);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/interest")
    public ResponseEntity<String> calculateInterest() {
        service.calculateInterest();
        return ResponseEntity.ok("Interest calculated for all accounts.");
    }
}
