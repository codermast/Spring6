package com.codermast.spring6.iocxml.bean.autowire.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
