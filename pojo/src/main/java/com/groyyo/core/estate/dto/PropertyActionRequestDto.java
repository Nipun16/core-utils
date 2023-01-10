/**
 * 
 */
package com.groyyo.core.estate.dto;

import com.groyyo.core.estate.enums.EstateStatus;
import com.groyyo.core.estate.enums.PropertyAction;

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
public class PropertyActionRequestDto {

	private String reason;
	private String estateUuid;
	private EstateStatus estateStatus; //This attribute set internally
	private PropertyAction propertyAction;	
	private String propertyName;
}
