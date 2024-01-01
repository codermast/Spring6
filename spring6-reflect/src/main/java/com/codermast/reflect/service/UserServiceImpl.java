package com.codermast.reflect.service;

import com.codermast.reflect.core.Bean;
import com.codermast.reflect.core.Di;
import com.codermast.reflect.dao.UserDao;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}