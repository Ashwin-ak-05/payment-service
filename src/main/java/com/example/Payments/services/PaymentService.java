package com.example.Payments.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(String ordertId,Long amount) throws StripeException;
}
