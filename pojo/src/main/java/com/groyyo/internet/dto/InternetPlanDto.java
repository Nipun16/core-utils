package com.groyyo.internet.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.enums.DataUnit;
import com.groyyo.internet.enums.InternetVendor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetPlanDto extends AbstractDto {

	private static final long serialVersionUID = -2437579710833694770L;

	private InternetVendor vendor;

	private String planName;

	private int data;

	private DataUnit dataUnit;

	private int speed;

	private DataUnit speedUnit;

	private int validity;

	private Double basePrice;

	private Double tax;

	private Double totalPrice;

	private int userMGPercent;
}