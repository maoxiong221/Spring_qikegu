package com.qikegu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        User user = (User) context.getBean("user");
//        user.getName();
//        user.printThrowException();
//        ((ClassPathXmlApplicationContext) context).close();

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.start();
    }
}
