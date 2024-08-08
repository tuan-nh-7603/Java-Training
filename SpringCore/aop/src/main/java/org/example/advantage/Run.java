package org.example.advantage;

import org.example.advantage.service.AccountService;
import org.example.advantage.service.TransactionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService = context.getBean(AccountService.class);
        accountService.deposit(100);
        try {
            accountService.withdraw(1500);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        TransactionService transactionService = context.getBean(TransactionService.class);
        transactionService.transfer(50, "Account1", "Account2");

    }
}

