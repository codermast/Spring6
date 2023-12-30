package com.codermast.spring6.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
