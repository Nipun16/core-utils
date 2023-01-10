package com.groyyo.core.bookingservice.dto.response;

import com.groyyo.booking.enums.BookingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SoldBookingDto {
    private String residenceUuid;
    private String bookingUuid;
    private BookingType bookingType;
    private Date lockInEnd;
    private Date contractStart;
    private String lockInDuration;

}
