package com.groyyo.core.payment.dto;

import com.groyyo.core.payment.enums.PaymentMode;
import com.groyyo.core.payment.enums.GroyyoPaymentService;
import com.groyyo.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentLinkRequestDto {

    private Integer amount;
    private String contact;
    private String createdBy;
    private String description;
    private String email;
    private boolean isEndUserPayingFee;
    private Object meta;
    private String paymentMode;
    private String paymentSource;
    private GroyyoPaymentService groyyoPaymentService;
    private String userType;
    private String userId;
}
