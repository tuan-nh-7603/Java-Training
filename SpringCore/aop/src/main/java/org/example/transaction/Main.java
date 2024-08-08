package org.example.transaction;

import org.example.transaction.entity.User;
import org.example.transaction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = context.getBean(UserService.class);

        User user = new User();
        user.setName("John Doe");
        userService.createUser(user);

        User retrievedUser = userService.getUser(user.getId());
        System.out.println("Retrieved User: " + retrievedUser.getName());
    }
}
