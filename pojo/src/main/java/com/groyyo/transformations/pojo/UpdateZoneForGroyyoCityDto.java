package com.groyyo.transformations.pojo;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.transformations.pojo.AddGroyyoClusterDto;

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
public class UpdateZoneForGroyyoCityDto {
	
	
	private UIKeyValue zone;
	
	private List<UIKeyValue> groyyoCities;
	private List<GroyyoCityAndZone> rows;
	private List<UIKeyValue> zoneOptions;
}
