package com.groyyo.transformations.pojo;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.groyyo.core.generic.dto.UIKeyValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroyyoCityPostDto {
	private String cityName;
	private UIKeyValue status;
	private UIKeyValue zone;
	private List<UIKeyValue> groyyoClusters;
	private List<UIKeyValue> zoneOptions;
	private List<UIKeyValue> statusOptions;
	private List<UIKeyValue> groyyoClusterOptions;






}










