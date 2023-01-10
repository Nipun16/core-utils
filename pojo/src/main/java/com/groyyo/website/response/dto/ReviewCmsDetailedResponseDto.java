package com.groyyo.website.response.dto;

import java.util.Date;

import com.groyyo.core.enums.PropertyEntityType;
import com.groyyo.website.dto.SpecificLocationsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ReviewCmsDetailedResponseDto {

	private Long id;

	private boolean status;
	
	private String residentName;

	private String residentImage;
	
	private String reviewText;
	
	private PropertyEntityType reviewType;
	
	private Date reviewDate;
	
	private Integer position;
	
	private Boolean isForSpecificLocations;
	
	private SpecificLocationsDto specificLocationsDto;
}
