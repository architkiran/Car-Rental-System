package com.example.billing_service.controller;


import com.example.billing_service.model.Billing;
import com.example.billing_service.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/create")
    public Billing createBilling(@RequestBody Billing billing) {
        return billingService.createBilling(billing);
    }

    @GetMapping
    public List<Billing> getAllBillings() {
        return billingService.getAllBillings();
    }

    @GetMapping("/order/{orderId}")
    public Billing getBillingByOrderId(@PathVariable Long orderId) {
        return billingService.getBillingByOrderId(orderId);
    }
}
