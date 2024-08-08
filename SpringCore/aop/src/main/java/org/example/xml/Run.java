package org.example.xml;

import org.example.xml.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlcontext.xml");

        AccountService accountService = context.getBean(AccountService.class);
        accountService.deposit(100);
        accountService.withdraw(50);
    }
}
