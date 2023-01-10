package com.groyyo.community.brand.request;

import java.util.Date;

import com.groyyo.community.enums.EventStatus;
import com.groyyo.community.enums.UserList;
import com.groyyo.community.request.UserListDTO;
import com.groyyo.core.base.common.dto.AbstractDto;

import com.groyyo.genericdashboard.dto.AudienceLocationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDealsRequestDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private String brandName;
	
	@Default
	private EventStatus dealStatus = EventStatus.IN_DRAFT;

	private String brandLogo;
	
	private String backgroundImage;
	
	private String dealDescription;
	
	private String dealInfo;
	
	private int priority;
	
	private String primaryCtaText;
	
	private String secondaryCtaText;
	
	@Default
	private UserList userList = UserList.ALL;
	
//	private UserListDTO userListDto;
	
//	private String csvUrl;
	
//	private String locationUuids;
	
	private String genericCouponCode;
	
	private String redirectionUrl;
	
	private Date startDate;
	
	private Date endDate;
	
	private String couponCodesCsvUrl;
	
	private AudienceLocationDto audienceLocation;
}
