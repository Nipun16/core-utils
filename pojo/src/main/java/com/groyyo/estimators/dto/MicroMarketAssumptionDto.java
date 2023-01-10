package com.groyyo.estimators.dto;

import com.groyyo.estimators.enums.AssumptionSource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MicroMarketAssumptionDto {

	private long id;
	
	private long cityId;

	private String cityName;
	
	private long microMarketId;

	private String microMarketName;
	
	private String name;
	
	private String key;

	private AssumptionSource source;

	private double value;	
	
}
