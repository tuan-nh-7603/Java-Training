package org.example.advantage.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void deposit(double amount) {
        System.out.println("deposit " + amount);
    }

    public void withdraw(double amount) {
        System.out.println("withdraw " + amount);
        if (amount > 1000) {
            throw new RuntimeException("Amount exceeds limit");
        }
    }
}
