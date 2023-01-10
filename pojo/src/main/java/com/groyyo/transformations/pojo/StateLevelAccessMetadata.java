package com.groyyo.transformations.pojo;

import lombok.*;

import java.util.Map;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StateLevelAccessMetadata {

	private Map<Long, CityLevelAccessMetadata> stateLevel;
	
	private Map<Long,StateUIDto> stateNameView;
}
