package com.transaction.example.service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

@Component
public class UserProgramaticApproach1 {

    PlatformTransactionManager transactionManager;

    public UserProgramaticApproach1(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }


    public void updateUserProgramatic(){
        TransactionStatus status = transactionManager.getTransaction(null);
        try {
            System.out.println("Insert Query run");
            System.out.println("Update Query run");
            transactionManager.commit(status);
        }catch (Exception e){
            transactionManager.rollback(status);
        }
    }

}
