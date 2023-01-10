/**
 * 
 */
package com.groyyo.core.estate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EstateAppAttributes {

	private String totalArea;

	private String numberOfRooms;

	private String numberOfFloors;
	
	private String pricePerBed;

	private String numberOfBeds;
	
	private String numberOfEffectiveBeds;

	private String pricePerEffectiveBed;
	
	private String pocNumber;
	
	private String pocName;

	private String rent;
	
	private String securityDeposit;
	
	private String advanceRent;
	
	private String lockInPeriod;
	
	private String handOverDate;
	
	private String startYear;
	
	private String endYear;
	
	private String tenure;
	
	private String rentFreePeriod;
	
}