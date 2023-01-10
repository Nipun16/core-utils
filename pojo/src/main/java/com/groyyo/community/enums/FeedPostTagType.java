package com.groyyo.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeedPostTagType {

	EVENTS("Events");

	private final String tagTypeName;
}
