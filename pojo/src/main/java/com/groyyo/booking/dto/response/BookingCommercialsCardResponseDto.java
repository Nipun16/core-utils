package com.groyyo.booking.dto.response;

import com.groyyo.booking.enums.BookingType;
import com.groyyo.booking.enums.MaintenanceFeeCollectionType;
import com.groyyo.booking.enums.PaymentTerm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCommercialsCardResponseDto {

    private BookingType bookingType;

    private PaymentTerm paymentTerm;

    private String commercialsCardUuid;

    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    private Double onBoardingCharge;
}
