/**
 * 
 */
package com.stanzaliving.internet.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InternetLoginDataRequestDto {

	@NotEmpty(message = "Property Ids are mandatory")
	private List<String> propertyIds;

	@NotNull(message = "Start Date is Mandatory")
	private LocalDate startDate;

	@NotNull(message = "End Date is Mandatory")
	private LocalDate endDate;
}