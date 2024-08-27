package com.transaction.example.service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;



@Component
public class UserProgramativeApproach2 {

    TransactionTemplate transactionTemplate;

    public UserProgramativeApproach2(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void upadateProgramatve(){
        TransactionCallback<TransactionStatus> dboperation = (TransactionStatus status) -> {
            System.out.println("Insert Query run");
            System.out.println("Update Query run");
          return status;
        };
        TransactionStatus transactionStatus = transactionTemplate.execute(dboperation);
    }
}
