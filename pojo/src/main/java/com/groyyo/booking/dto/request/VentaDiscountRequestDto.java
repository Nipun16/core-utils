package com.groyyo.booking.dto.request;

import com.groyyo.booking.enums.BookingSubType;
import com.groyyo.booking.enums.BookingType;
import com.groyyo.booking.enums.PropertyType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDiscountRequestDto {
	private PropertyType propertyType;
	private BookingType bookingType;
	private String residenceUuid;
	private String mocromarketUuid;
	private String cityUuid;
	private Double bookingMonthlyRent;
	private BookingDiscountCriteriasDto bookingDiscountCriterias;
	// to distinguish between venta and alfred flow
	@Builder.Default
	private Boolean ventaFlow = Boolean.FALSE;
	private String discountUuid;
	private BookingSubType bookingSubType;
}
