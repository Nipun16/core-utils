package com.groyyo.booking.dto.request;

import com.groyyo.booking.enums.BookingType;
import com.groyyo.booking.enums.PaymentTerm;
import com.groyyo.booking.enums.ReferenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailsRequestDto implements Serializable {

	@NotNull(message = "referenceId cannot be null or blank")
	private String referenceId;
	
	@NotNull(message = "reference type cannot be null or blank")
	@Builder.Default
	private ReferenceType referenceType = ReferenceType.BOOKING;
	
	@NotNull(message = "contractStartDate cannot be null")
	private Date contractStartDate;
	
	@NotNull(message = "contractEndDate cannot be null")
	private Date contractEndDate;

	private Date modifiedContractStartDate;

	private Date stayLockInEndDate;

	private double stayLockInMonths;

	private Date subContract1EndDate;

	private BookingType bookingType;
	
	@Builder.Default
	@NotNull(message = "payment term cannot be null")
	private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

	private Date newStayLockInEndDate;

	private Integer advanceRentalFirstMonths;

	private Integer advanceRentalLastMonths;

}
