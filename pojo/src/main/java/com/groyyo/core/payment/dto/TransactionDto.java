/**
 * 
 */
package com.groyyo.core.payment.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.payment.enums.PaymentMode;
import com.groyyo.core.payment.enums.PaymentStatus;
import com.groyyo.core.payment.enums.GroyyoPaymentService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto extends AbstractDto {

	private static final long serialVersionUID = -5460205171309799210L;

	private String merchantTransactionId;
	
	private String uuid;

	private double amount;

	private PaymentMode paymentMode;

	private PaymentStatus paymentStatus;

	private String userId;

	private String paymentMetadata;

	private GroyyoPaymentService paymentService;

	private String serviceTransactionId;
	
	private String refundTransactionId;

	private PaymentStatus refundStatus;

	private Double refundedAmount;
	
	private String currentPaymentId;

	private String bookingUuid;

}