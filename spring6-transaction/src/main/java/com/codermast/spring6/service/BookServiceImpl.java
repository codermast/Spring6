package com.codermast.spring6.service;

import com.codermast.spring6.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    //@Override
    //public void buyBook(Integer bookId, Integer userId) {
    //    //查询图书的价格
    //    Integer price = bookDao.getPriceByBookId(bookId);
    //    //更新图书的库存
    //    bookDao.updateStock(bookId);
    //    //更新用户的余额
    //    bookDao.updateBalance(userId, price);
    //}

    //@Transactional(readOnly = true)
    //public void buyBook(Integer bookId, Integer userId) {
    //    //查询图书的价格
    //    Integer price = bookDao.getPriceByBookId(bookId);
    //    //更新图书的库存
    //    bookDao.updateStock(bookId);
    //    //更新用户的余额
    //    bookDao.updateBalance(userId, price);
    //    //System.out.println(1/0);
    //}

    ////超时时间单位秒
    //@Transactional(timeout = 3)
    //public void buyBook(Integer bookId, Integer userId) {
    //    try {
    //        TimeUnit.SECONDS.sleep(5);
    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //    }
    //    //查询图书的价格
    //    Integer price = bookDao.getPriceByBookId(bookId);
    //    //更新图书的库存
    //    bookDao.updateStock(bookId);
    //    //更新用户的余额
    //    bookDao.updateBalance(userId, price);
    //    //System.out.println(1/0);
    //}

    @Transactional(noRollbackFor = ArithmeticException.class)
//@Transactional(noRollbackForClassName = "java.lang.ArithmeticException")
    public void buyBook(Integer bookId, Integer userId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
        System.out.println(1/0);
    }
}