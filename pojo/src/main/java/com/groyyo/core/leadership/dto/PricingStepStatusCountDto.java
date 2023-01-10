package com.groyyo.core.leadership.dto;

import com.groyyo.core.leadership.enums.PricingStepStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingStepStatusCountDto {
	
	private PricingStepStatus status;
	
	private String name;
    
	private Long count;
    
	private Double percentage;
	
	private String color;
    
}
