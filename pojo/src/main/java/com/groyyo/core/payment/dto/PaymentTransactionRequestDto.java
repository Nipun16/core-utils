package com.groyyo.core.payment.dto;


import com.groyyo.core.payment.enums.PaymentMode;
import com.groyyo.core.payment.enums.PaymentSource;
import com.groyyo.core.payment.enums.GroyyoPaymentService;
import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTransactionRequestDto {
    @NotNull(message = "Requester Service is mandatory")
    private GroyyoPaymentService groyyoPaymentService;

    @NotBlank(message = "User Id is mandatory")
    private String userId;

    @NotBlank(message = "Internal transaction Id is mandatory")
    private String transactionId;

    private Double amount;

    PaymentMode paymentMode;

    @Builder.Default
    private Boolean isEndUserPayingFee = false;

    private String chequeId;

    private String orderId;

    private PaymentSource paymentSource;

    private String chequeImageUrl;

    private String virtualAccountNumber;
}
