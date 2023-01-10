package com.groyyo.paymentService.dto;

import com.groyyo.core.payment.enums.PaymentMode;
import com.groyyo.core.payment.enums.PaymentSource;
import com.groyyo.core.payment.enums.PaymentStatus;
import com.groyyo.core.payment.enums.GroyyoPaymentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentEntityDto {

    private String merchantTransactionId;

    private String currentPaymentId;

    private double amount;

    private PaymentMode paymentMode;

    private PaymentStatus paymentStatus;

    private String transactionType;

    private String userId;

    private String userType;

    private String paymentMetadata;

    private PaymentSource paymentSource;

    private String bookingUuid;

    private GroyyoPaymentService paymentService;

    private String serviceTransactionId;

    private boolean current = true;

    private String refundTransactionId;

    private Boolean isEndUserPayingFee = false;

    private String chequeNumber;

    private Boolean isMigrated = false;

    private String rblTransactionId;

    private Long id;

    private String uuid;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private Date updatedAt;
}
