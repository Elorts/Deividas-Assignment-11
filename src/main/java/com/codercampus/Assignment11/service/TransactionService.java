package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepo;

    
    public List<Transaction> findAll() {

        List<Transaction> listOfTransactions = getTransactions();
        listOfTransactions.sort((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
        return listOfTransactions;
    }

    private List<Transaction> getTransactions() {
        List <Transaction> listOfTransactions = transactionRepo.findAll();
        return listOfTransactions;
    }

    public Transaction findById(Long id) {
//        Optional<Transaction> resultById = listOfTransactions.stream().filter(item -> item.equals(id))
//                                                                      .findFirst();
        Transaction resultById = null;

        List <Transaction> listOfTransactions = getTransactions();
        for (Transaction t : listOfTransactions)
            if (t.getId() == id) {
                resultById = t;
                System.out.println("id:" + id);
            }
        return resultById;
    }
}
