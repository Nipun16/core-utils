package com.groyyo.core.projectservice.dto;


import com.groyyo.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetailDto {
    String paymentUuid;
    PaymentMode paymentMode;
    Date paymentDate;
    String bookingUuid;
    double amount;
}

