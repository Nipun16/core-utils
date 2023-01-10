/**
 * 
 */
package com.groyyo.core.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@AllArgsConstructor
public enum GroyyoPaymentService {

	FOOD("Food"),
	IMS("Venta"),
	WEBSITE("Website"),
	ALFRED("Alfred"),
	CAFE("Cafe"),
	FOOD_SUBSCRIPTION("Food Subscription"),
	PREPAID_METER("Prepaid Meter")
	;

	private String displayName;
}