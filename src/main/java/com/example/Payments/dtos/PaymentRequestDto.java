package com.example.Payments.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDto {
    String orderId;
    Long amount;
}
