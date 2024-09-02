package com.example.Payments.services;

import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

@Service
public class RazonpayPaymentService implements PaymentService {

    @Override
    public String generatePaymentLink(String ordertId, Long amount) {
        return "";
    }
}
