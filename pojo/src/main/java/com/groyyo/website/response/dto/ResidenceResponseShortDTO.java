package com.groyyo.website.response.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.groyyo.core.enums.PropertyEntityType;
import com.groyyo.website.enums.FomoTag;
import com.groyyo.website.enums.Gender;

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
public class ResidenceResponseShortDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int residenceId;

	private String name;

	private String slug;

	private Gender gender;
	
	private String genderName;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;

	private int cityId;

	private String cityName;

	private String citySlug;

	private int startingPrice;

	private String pricingPlan;

	private Integer preBookingAmount;

	private Integer unlockDiscountAmount;

	private String preBookingMode;

	private String googleMapLink;

	private double latitude;

	private double longitude;

	private String virtualTourImage;

	private String videoLink;

	private Integer sortOrder;

	private Integer secondSortOrder;

	private FomoTag fomoTag;

	private String fomoTagName;

	private String fomoTagcolour;

	private Double distanceFromPlace;

	private String transformationUuid;

	private String transformationId;

	private Integer residenceAddressId;

	private AddressResponseDTO addressResponseDTO;
	private Integer residenceTypeId;
	
	private PropertyEntityType propertyEntityType;

	@Builder.Default
	private Set<FacilityResponseDTO> facilities = new HashSet<>(0);
	
	@Builder.Default
	private List<FeatureResponseDTO> features = Collections.emptyList();

	@Builder.Default
	private List<ResidenceOccupancyResponseDTO> residenceOccupancies = Collections.emptyList();

	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
}
