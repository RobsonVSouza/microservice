package com.ms.hrpayroll.services;

import com.ms.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Franchesco", 13894.0, days);
    }
}
