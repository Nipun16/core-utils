package com.groyyo.locator.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GroyyoPropertyDto {

	private String name;
	private String cityName;
	private Double latitude;
	private Double longitude;
	private Integer bedCount;
	private Long studentEnrollmentCount;
	private Double distance;
	private String gender;
}
