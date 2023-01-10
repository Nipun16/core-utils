package com.groyyo.transformations.pojo;


import javax.validation.constraints.NotNull;

import com.groyyo.core.food.enums.DemoGraphicsRegion;
import com.groyyo.transformations.enums.TimeZone;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StateUIDto {

	private String uuid;
	
	private long id;
	
	@NotNull(message = "State name is mandatory")
	private String stateName;
	
	@NotNull(message = "Country name is mandatory")
	private String countryName;
	
	@NotNull(message = "Time zone is mandatory")
	private TimeZone timeZone;
	
	private boolean status;
	
	private long countryId;

	private DemoGraphicsRegion foodRegion;
}
