package com.groyyo.core.leadership.dto;

import java.util.List;

import com.groyyo.core.base.common.dto.PageResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class PricingStepListingReponseDto {

	private List<PricingStepStatusCountDto> pricingStepStatusCountDtos;
	
	private PageResponse<PricingApprovalScreenDto> response;
}
