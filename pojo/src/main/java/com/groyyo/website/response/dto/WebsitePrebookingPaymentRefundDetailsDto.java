package com.groyyo.website.response.dto;

import java.util.Date;

import com.groyyo.core.enums.PropertyEntityType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsitePrebookingPaymentRefundDetailsDto {

	private String prebookingDate;

	private String paymentUuid;
	
	private String phone;
	
	private double amount;
	
	private Date refundedOn;
	
	private PropertyEntityType propertyEntityType;
	
	ResidenceResponseShortDTO residenceResponseShortDto;
	
	ApartmentResponseDto apartmentResponseDto;
}
