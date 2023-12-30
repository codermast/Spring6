package com.codermast.spring6.iocxml.bean.autowire.service;


import com.codermast.spring6.iocxml.bean.autowire.dao.UserDao;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

}
