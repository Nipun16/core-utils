package com.groyyo.community.feedpost.request;

import java.util.Date;
import java.util.List;

import com.groyyo.banner.enumeration.AppPage;
import com.groyyo.community.enums.EventStatus;
import com.groyyo.community.request.FeedPostMediaDto;
import com.groyyo.community.request.FeedPostTagsDto;
import com.groyyo.community.request.UserListDTO;
import com.groyyo.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostRequestDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	@Default
	private EventStatus postStatus = EventStatus.IN_DRAFT;
	
    private String title;

	private String description;

    private String ctaText;

	private String redirectLink;

    private Date startDate;

    private Date endDate;

    private Integer priority;
    
    @Builder.Default
	protected boolean prompted = false;

	private List<AppPage> appPages;
    
	private UserListDTO userListDto;
	
	private List<FeedPostMediaDto> mediaDtos;
	
	private List<FeedPostTagsDto> tagDtos;
}
