package com.groyyo.core.leadership.dto;

import com.groyyo.core.enums.PropertyEntityType;
import com.groyyo.transformations.enums.BrandName;
import com.groyyo.transformations.enums.GenderAllowed;
import com.groyyo.transformations.enums.SubBrandName;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PropertyNamingDto {

	private String uuid;

	private String estateName;

	private String estateUuid;
	
	private Long estateId;
	
	private String estateCode;

	private String propertyName;

	private BrandName brandName;

	private SubBrandName subBrandName;

	private GenderAllowed gender;

	private Double totalPremiseArea;

	private Integer numBeds;

	private Integer numRooms;

	private String apartmentFloorNumber;
	
	private Long micromarketId;
	
	private boolean status;
	
	private Long cityId;

	private String propertyUuid;

	private String oldPropName;

	private PropertyEntityType propertyType;

}
