package com.groyyo.core.paymentPlan.dto;

import com.groyyo.booking.enums.PaymentTerm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceGenerationRequestDto {
    private String bookingUuid;
    private String residentUuid;
    private String residenceUuid;
    private PaymentTerm paymentTerm;
    private boolean completeInvoice;
    private LocalDate executionDate;
}
