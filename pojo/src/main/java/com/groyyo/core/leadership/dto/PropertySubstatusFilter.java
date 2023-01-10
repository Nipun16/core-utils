/**
 * 
 */
package com.groyyo.core.leadership.dto;

import com.groyyo.core.estate.enums.EstateStatus;

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
public class PropertySubstatusFilter {

	private boolean enabled;
	private EstateStatus propertySubStatus;
	private String displayText;
	private String propertySubStatusDesc;
	private int count;
}
