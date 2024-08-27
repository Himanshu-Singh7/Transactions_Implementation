package com.transaction.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;


@Component
public class UserService {

     @Autowired
     UserDao userDaoObj;


    @Transactional
    public void method1(){
        System.out.println("is Transaction is Active : "+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction name : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some initial DB Operation : ");
        userDaoObj.method2();
        System.out.println("Some Final DB Operation : ");
    }

}
