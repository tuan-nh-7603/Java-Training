package com.example.demo.PrototypeScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");

        HelloWorld hw1 = (HelloWorld)context.getBean("hw");

        hw1.setName("Thanh");
        System.out.println("Name of Hello 1: "
                        + hw1.getName());

        HelloWorld hw2 = (HelloWorld)context.getBean("hw");

        System.out.println("Name of Hello 2: "
                        + hw2.getName());

        System.out.println("'Hello 1' and 'Hello 2' " + "ref to the same object: "
                        + (hw1 == hw2));
    }
}
