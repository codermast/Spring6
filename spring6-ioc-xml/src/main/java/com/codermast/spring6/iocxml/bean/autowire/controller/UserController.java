package com.codermast.spring6.iocxml.bean.autowire.controller;

import com.codermast.spring6.iocxml.bean.autowire.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
