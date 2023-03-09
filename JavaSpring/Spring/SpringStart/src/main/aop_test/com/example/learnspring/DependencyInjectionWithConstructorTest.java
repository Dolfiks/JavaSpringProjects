package com.example.learnspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionWithConstructorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp1 = context.getBean("emp",Employee.class);
        emp1.infovehicle();
        context.close();
    }
}
