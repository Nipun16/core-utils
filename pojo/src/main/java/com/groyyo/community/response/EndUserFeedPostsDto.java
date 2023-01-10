package com.groyyo.community.response;

import java.util.List;

import com.groyyo.banner.enumeration.AppPage;
import com.groyyo.community.feedpost.response.FeedPostResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndUserFeedPostsDto {
	
	private int page;

	private int records;

	private int totalPages;

	private long totalRecords;
	
	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	private List<FeedPostResponseDto> feedPostResponseDtos;
}
