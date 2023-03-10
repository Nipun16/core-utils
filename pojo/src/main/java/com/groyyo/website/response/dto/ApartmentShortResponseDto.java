package com.groyyo.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.groyyo.website.enums.FomoTag;
import com.groyyo.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentShortResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer residenceId;
	
	private String name;
	
	private String apartmentDetailsName;
	
	private String apartmentListingName;
	
	private Gender gender;

	private Integer micromarketId;
	
	private String micromarketName;
	
	private String micromarketSlug;
	
	private String apartmentMMSlug;
	
	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private String apartmentCitySlug;
	
	private String propertyCode;
	
	private Integer societyId;
	
	private Integer roomCount;
	
	private String slug;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private String transformationUuid;
	
	private String transformationId;
	
	private Double latitude;
	
	private Double longitude;
	
	private Double distanceFromPlace;
	
	private List<FeatureResponseDTO> features;

	private AddressResponseDTO addressResponseDTO;
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>();
}