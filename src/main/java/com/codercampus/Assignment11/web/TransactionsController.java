package com.codercampus.Assignment11.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TransactionsController {

    @GetMapping("/transactions")
    public String getTransactions(ModelMap model) {
        return "transactions";
    }
}