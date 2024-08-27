package com.transaction.example.service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserDao {

    /*  @Transactional(propagation = Propagation.REQUIRED)
            if(parent txn present)
               Use it:
             else
               Create new transaction
    */

    /*    @Transactional(propagation = Propagation.REQUIRES_NEW)
           if(parent txn present)
            Suspend the parent txn:
            Create a new Txn and once finished:
            Resume the parent txn:
           else
             Create new transaction and execute the method:
    */



    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void method2(){
        // Execute DB Queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String transactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println("***********************************************");
        System.out.println("Propagation REQUIRED_NEW : is Transaction is Active :" + isTransactionActive);
        System.out.println("Propagation REQUIRED_NEW : Current Transaction name " + transactionName);
        System.out.println("*************************************************");

    }
}
