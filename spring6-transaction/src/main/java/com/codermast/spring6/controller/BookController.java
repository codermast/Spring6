package com.codermast.spring6.controller;

import com.codermast.spring6.service.BookService;
import com.codermast.spring6.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId){
        bookService.buyBook(bookId, userId);
    }

    @Autowired
    private CheckoutService checkoutService;

    public void checkout(Integer[] bookIds, Integer userId){
        checkoutService.checkout(bookIds, userId);
    }
}