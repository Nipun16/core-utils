/**
 * 
 */
package com.groyyo.core.leaddashboard.dto;

import java.util.List;

import com.groyyo.core.leaddashboard.enums.LeadSourceEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class LeadFunnelGraphRequestDto {

	private String selectedDate;
	private List<String> city;
	private List<String> micromarket;
	private List<String> residence;
	private List<LeadSourceEnum> leadSource;
	private int days;
}
