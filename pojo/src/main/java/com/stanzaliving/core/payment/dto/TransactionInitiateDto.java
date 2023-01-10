/**
 * 
 */
package com.stanzaliving.core.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder.Default;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionInitiateDto {

	private String paymentId;

	private String pgOrderId;

	private String callbackUrl;
	
	private Integer amount;
	
	private String currency;

	private String merchantTransactionId;
	
	@Default
	private Boolean isEndUserPayingFee = false;
	
	private String paymentModeKey;
}