package com.transaction.example.service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDeclarative {

    @Transactional(transactionManager = "userTransactionManager")
    public void updateUserDeclarative(){
        //SOME DB OPERATION
            System.out.println("Insert Query run");
            System.out.println("Update Query run");
    }
}
