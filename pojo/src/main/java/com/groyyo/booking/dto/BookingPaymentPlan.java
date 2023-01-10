package com.groyyo.booking.dto;

import java.util.List;

import com.groyyo.booking.dto.response.PaymentPlanLineItemResponse;
import com.groyyo.booking.enums.PaymentPlanResponseType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingPaymentPlan {

    private PaymentPlanResponseType type = PaymentPlanResponseType.BOOKING;

    private double bookingAmount;

    private List<PaymentPlanLineItemResponse> lineItems;
}
