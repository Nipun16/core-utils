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
public class PropertyDashboardActionDto {

	private String uuid;
	private String estateUuid;
	private PropertyAction requestAction;
	private EstateStatus estateStatus;
	private String reason;
}
