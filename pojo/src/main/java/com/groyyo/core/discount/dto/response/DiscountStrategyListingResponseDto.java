package com.groyyo.core.discount.dto.response;

import com.groyyo.booking.enums.ApplicabilityLevelType;
import com.groyyo.booking.enums.DiscountApplicabilityType;
import com.groyyo.booking.enums.PropertyType;
import com.groyyo.booking.enums.Strategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountStrategyListingResponseDto {
	
	private String uuid;
	
    private String strategyName;

    private String strategy;
    
    private String applicationDate;
    
    private Boolean status;
    
    private Set<String> city;
    
    private Set<String> micromarket;
    
    private Set<String> residence;
    
    private ApplicabilityLevelType applicabilityLevelType;
    
    private String cityUuid;
    
    private String micromarketUuid;
    
    private String residenceUuid;
    
    private Strategy actualStrategy;
    
    private Integer startMonth;
    
    private Integer endMonth;
    
    private String ventaDisplayName;
    
    private DiscountApplicabilityType applicabilityType;
    
    private Integer maxDiscountPercentage;
    
    private Map<String,String> monthWiseDiscountPercentage;
    
    private Integer cutOffDate;
    
    private PropertyType propertyType;

}
