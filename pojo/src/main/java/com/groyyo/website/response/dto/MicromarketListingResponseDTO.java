package com.groyyo.website.response.dto;

import com.groyyo.core.user.enums.EnumListing;
import com.groyyo.website.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketListingResponseDTO {

	private int micromarketId;
	private String name;
	private String slug;
	private int cityId;
	private String cityName;
	private String citySlug;
	private double latitude;
	private double longitude;
	private String phone;
	EnumListing<Status> status;
	@Default
	private boolean enabled = true;
}
