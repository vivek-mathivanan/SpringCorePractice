package com.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {



        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Writer writer = (Writer) applicationContext.getBean("writer") ;

        writer.write();

    }
}
