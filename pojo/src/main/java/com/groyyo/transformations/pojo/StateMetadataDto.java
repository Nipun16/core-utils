/**
 * 
 */
package com.groyyo.transformations.pojo;

import com.groyyo.core.food.enums.DemoGraphicsRegion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateMetadataDto {

	private long stateId;

	private String uuid;

	private String stateName;
	
	private DemoGraphicsRegion defaultFoodRegion;

	private long countryId;
	
	private String countryUuid;
}