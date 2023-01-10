package com.groyyo.community.request;

import java.util.List;

import com.groyyo.community.enums.FeedPostTagType;
import com.groyyo.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostTagsDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

    private String postUuid;

    private FeedPostTagType tagType;
    
	private List<String> tagValues;
}