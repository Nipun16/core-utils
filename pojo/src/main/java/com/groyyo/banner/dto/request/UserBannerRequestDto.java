package com.groyyo.banner.dto.request;

import com.groyyo.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBannerRequestDto {

	private AppPage appPage;
	
	private String userCode;
	
	private String userId;
	
	private String cityUuid;
	
	private String micromarketUuid;
	
	private String residenceUuid;
}
