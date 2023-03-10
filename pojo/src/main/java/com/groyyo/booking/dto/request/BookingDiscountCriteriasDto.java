package com.groyyo.booking.dto.request;

import com.groyyo.booking.enums.MathematicalSymbol;
import com.groyyo.booking.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingDiscountCriteriasDto {
	@Builder.Default
	private MathematicalSymbol upfrontPaymentSymbol=MathematicalSymbol.GREATER_THAN_EQUAL_TO;
    private Double upfrontPaymentMonth;
    @Builder.Default
    private MathematicalSymbol lockInDurationSymbol=MathematicalSymbol.GREATER_THAN_EQUAL_TO;
    private Double lockInDurationMonth;
    private PaymentMode paymentMode;
    private String specificInventory;
    @Builder.Default
    private Boolean applicableOnRoomConversion = Boolean.FALSE;
    private String leadTag;
    private Boolean entireFlatBooking;
    private Date preBookFromDate;
    private Date preBookToDate;

}
