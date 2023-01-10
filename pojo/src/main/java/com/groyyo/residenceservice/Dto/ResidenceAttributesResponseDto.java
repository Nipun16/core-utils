/**
 * 
 */
package com.groyyo.residenceservice.Dto;

import com.groyyo.residenceservice.enums.ResidenceAttributes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class ResidenceAttributesResponseDto {

	private ResidenceAttributes residenceAttributes;
	private String value;
}
