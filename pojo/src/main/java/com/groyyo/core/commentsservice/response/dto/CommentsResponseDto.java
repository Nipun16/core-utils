package com.groyyo.core.commentsservice.response.dto;

import java.util.Map;

import com.groyyo.core.base.common.dto.PageResponse;
import com.groyyo.core.commentsservice.dto.CommentsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsResponseDto{

	PageResponse<CommentsDto> comments;
	
	Map<String, Long> subContextCount;
}
