package com.groyyo.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.groyyo.core.base.common.dto.PageResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResidenceListingPageResponse extends PageResponse<ResidenceListingPageResponse> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ResidenceListingCardDto> residenceResponseShortDTOs;

	private List<Integer> residenceIdsToShowMapPin;
}
