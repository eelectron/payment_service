package com.example.payment_service.service;

import com.example.payment_service.entity.Payment;
import com.example.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.UUID;

@Service
public class PaymentService {
    @Inject
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        paymentRepository.save(payment);
        return payment;
    }
}
