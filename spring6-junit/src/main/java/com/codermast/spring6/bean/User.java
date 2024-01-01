package com.codermast.spring6.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        System.out.println("run user");
    }
}