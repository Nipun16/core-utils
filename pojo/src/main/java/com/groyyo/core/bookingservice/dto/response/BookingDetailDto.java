package com.groyyo.core.bookingservice.dto.response;

import com.groyyo.booking.enums.BookingSubStatus;
import com.groyyo.core.bookingservice.dto.response.PackagedServiceResponseDto;
import com.groyyo.core.bookingservice.dto.response.UserDetailResponseDto;
import com.groyyo.core.discount.dto.response.BookingDiscountDetailsResponseDto;

import io.github.resilience4j.core.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetailDto {

    private String bookingUuid;
    private BookingSubStatus bookingSubStatus;
    private String source;
    private UserDetailResponseDto userDetailResponseDto;
    private BookingDurationResponseDto bookingDurationDto;
    private RoomDetailsDto roomDetailsDto;
    private PackagedServiceResponseDto packagedServices;
    @NonNull
    private CommercialCodeDto commercialDetailsDto;
    private BookingDiscountDetailsResponseDto discountDetailsDto;
    private String alert;

}