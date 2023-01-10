package com.stanzaliving.website.response.dto;

import java.util.Date;

import com.stanzaliving.core.enums.PropertyEntityType;

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
public class ReviewCmsListingResponseDto {

	private Long id;

	private boolean status;
	
	private String residentName;

	private String residentImage;
	
	private String reviewText;
	
	private PropertyEntityType reviewType;
	
	private String reviewTypeName;
	
	private Date reviewDate;
	
	private Integer position;
	
	private Boolean isForSpecificLocations;
}
