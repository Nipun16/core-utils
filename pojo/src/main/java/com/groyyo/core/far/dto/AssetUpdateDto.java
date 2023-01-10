/**
 * @author nipunaggarwal
 *
 */
package com.groyyo.core.far.dto;

import java.math.BigDecimal;

import com.groyyo.core.base.common.dto.AbstractSearchIndexDto;
import com.groyyo.core.far.enums.AssetAllocatedTo;
import com.groyyo.core.far.enums.AssetStatus;
import com.groyyo.core.far.enums.AssetType;
import com.groyyo.transformations.enums.LocationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AssetUpdateDto extends AbstractSearchIndexDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String assetId;
	private String assetName;
	private String assetDescription;
	private String qrCode;
	private String qrCodeId;

	private AssetType assetType;
	private AssetStatus assetStatus;
	private String itemCode;
	private String vendorUuid;
	private BigDecimal itemsInPackage;
	private BigDecimal acquisitionPrice;
	private boolean isAmcCovered;
	private boolean isInsuranceCovered;
	
	private String locationName;
	private String allocationUuid;
	private LocationType locationType;
	private AssetAllocatedTo allocatedTo;

	private String assetNameSearch;
	private String assetNameSuggest;
	private String qrCodeIdSearch;
	private String assetDescriptionSearch;
	private String assetIdSearch;
}
