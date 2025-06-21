package com.nekta.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountImpl implements AccountDAO{

    @Override
    public void addAccount() {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
