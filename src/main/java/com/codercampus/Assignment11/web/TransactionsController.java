package com.codercampus.Assignment11.web;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TransactionsController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public String getTransactions(ModelMap model) {

        List<Transaction> transactions = transactionService.findAll();

        model.put("transactions", transactions);
        return "transactions";
    }
}
