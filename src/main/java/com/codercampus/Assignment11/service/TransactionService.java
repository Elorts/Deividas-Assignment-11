package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepo;

    public List<Transaction> findAll() {
        List<Transaction> listOfTransactions = transactionRepo.findAll();
        listOfTransactions.sort((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
        return listOfTransactions;
    }

    public Transaction findById(Long id) {
        Transaction resultById = null;
        List <Transaction> listOfTransactions = transactionRepo.findAll();

        for (Transaction t : listOfTransactions) {
            if (t.getId().equals(id)) {
                resultById = t;
                break;
            }
        }
        return resultById;
    }
}
