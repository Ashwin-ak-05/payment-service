package com.example.Payments.controllers;

import com.example.Payments.dtos.PaymentRequestDto;
import com.example.Payments.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    PaymentService paymentService;
    @Autowired

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping("/payments")
    public String createPaymentLink(@RequestBody PaymentRequestDto paymentRequestDto) throws StripeException {
        String url = paymentService.generatePaymentLink(paymentRequestDto.getOrderId(),paymentRequestDto.getAmount());
        return url;
    }
}
