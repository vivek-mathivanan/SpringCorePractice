package com.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    Constructor based injection
    @Bean
    public Writer writer(Pen pen){
        return new Writer(pen);
    }

//    Setter based injection
//    @Bean
//    public Writer writer(Pen pen){
//        Writer writer = new Writer();
//        writer.setPen(pen);
//        return writer;
//    }

    @Bean
    public Pen flairPen(Ink ink){
        return new FlairPen(ink);
    }

//    @Bean
//    public Pen pen(Ink ink){
//        FlairPen flairPen = new FlairPen();
//        flairPen.setInk(ink);
//        return flairPen;
//    }

    @Bean
    public Ink blackInk(){
        return new BlackInk();
    }

}
