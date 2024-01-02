package com.codermast.spring6.service;

public interface CheckoutService {
    void checkout(Integer[] bookIds, Integer userId);
}