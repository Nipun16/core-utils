/**
 * 
 */
package com.groyyo.core.estate.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.estate.enums.EstateStatus;
import com.groyyo.core.legal.enums.LegalAgreementDocTypes;
import com.groyyo.core.user.dto.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

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
public class EstateDto extends AbstractDto {

	private String estateName;

	private String estatePropertyId;

	private Address address;

	private Long cityId;

	private String cityName;

	private Long micromarketId;

	private String micromarketName;

	private Double lat;

	private Double lon;

	private EstateStatus estateStatus;

	private String propertyStatus;

	private String propertyStatusDescription;

	private String colorCode;

	private String backgroundColorCode;

	private String estateCode;
	
	private String managerName;
	
	private String propertyName;
	
	private LegalAgreementDocTypes legalAgreementDocType;

	private String brandType;

	private String competitorName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date propertyApprovalTime;

}