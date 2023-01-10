package com.groyyo.core.commercialcode.dto;

import com.groyyo.commercialcard.enums.CommercialCardBooking;
import com.groyyo.commercialcard.enums.CommercialCardStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommercialCardBookingDto {
    private String bookingUuid;

    private CommercialCardBooking bookingStatus;

    private String commercialCardUuid;

    private CommercialCardStatus cardStatus;

}