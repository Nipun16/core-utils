package com.groyyo.community.feedpost.response;

import java.util.Date;
import java.util.List;

import com.groyyo.banner.enumeration.AppPage;
import com.groyyo.community.enums.EventStatus;
import com.groyyo.community.request.FeedPostMediaDto;
import com.groyyo.community.request.FeedPostTagsDto;
import com.groyyo.community.request.UserListDTO;
import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private EnumListing<EventStatus> postStatusDto;
	
    private String title;
    
    private String postId;

	private String description;

    private String ctaText;

	private String redirectLink;

    private Date startDate;

    private Date endDate;

    private Integer priority;
    
	protected boolean prompted;

	private List<EnumListing<AppPage>> appPagesDto;
    
	private UserListDTO userListDto;
	
	private List<FeedPostMediaDto> mediaDtos;
	
	private List<FeedPostTagsDto> tagDtos;
}