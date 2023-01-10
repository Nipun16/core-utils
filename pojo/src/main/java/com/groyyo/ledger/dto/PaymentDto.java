package com.groyyo.ledger.dto;

import com.groyyo.collector.enums.TransactionType;
import com.groyyo.core.payment.enums.PaymentMode;
import com.groyyo.core.payment.enums.PaymentStatus;
import com.groyyo.core.payment.enums.GroyyoPaymentService;
import com.groyyo.core.user.enums.UserType;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentDto {

    private String merchantTransactionId;
    private String currentPaymentId;
    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private TransactionType transactionType;
    private String userId;
    private UserType userType;
    private String paymentMetadata;
    private String bookingUuid;
    private GroyyoPaymentService paymentService;
    private String serviceTransactionId;
    private boolean current;
    private String refundTransactionId;
}
