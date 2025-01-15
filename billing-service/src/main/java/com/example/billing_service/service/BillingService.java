package com.example.billing_service.service;



import com.example.billing_service.model.Billing;
import com.example.billing_service.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

    public Billing getBillingByOrderId(Long orderId) {
        return billingRepository.findById(orderId).orElse(null);
    }
}
