package com.groyyo.ventaAudit.dto;

import com.groyyo.booking.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequestDto {

    @NotBlank(message = "BookingId Is Required")
    String bookingId; //will be passing Uuid
    @NotBlank(message = "UserUuid Is Required")
    String userUuid;
    Double amount;
    PaymentMode paymentMode;

}
