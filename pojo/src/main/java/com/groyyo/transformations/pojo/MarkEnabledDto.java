package com.groyyo.transformations.pojo;

import java.io.Serializable;
import java.util.List;

import com.groyyo.banner.enumeration.SectionType;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.transformations.enums.Section;
import com.groyyo.transformations.pojo.ZoneUIDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarkEnabledDto {
	
	private Boolean enabled;
	
	private CategoryFilter section;
	
	private List<String> groyyoCity;
	
	private List<String> groyyoCluster;

	private List<String> zones;





}
