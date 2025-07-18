package com.legacybanking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BankingService {

    @Autowired
    private AccountRepository accountRepo;

    @Autowired
    private TransactionRepository txnRepo;

    public Account createAccount(String name, Double balance) {
        Account acc = new Account();
        acc.setName(name);
        acc.setBalance(balance);
        return accountRepo.save(acc);
    }

    public void calculateInterest() {
        List<Account> accounts = accountRepo.findAll();
        for (Account acc : accounts) {
            double interest = acc.getBalance() * 0.03;
            acc.setBalance(acc.getBalance() + interest);
            accountRepo.save(acc);

            Transaction txn = new Transaction();
            txn.setAccountId(acc.getId());
            txn.setAmount(interest);
            txn.setType("CREDIT");
            txn.setTimestamp(LocalDateTime.now());
            txnRepo.save(txn);
        }
    }
}
