package com.groyyo.transformations.pojo;

import java.util.List;

import com.groyyo.transformations.enums.BrandName;
import com.groyyo.transformations.enums.UnitType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GCItemMasterUIDto {

	private String uuid;

	private String category;

	private String particular;
	
	private String categoryCode;

	private UnitType unitType;

	private String itemCode;

	private String specification;

	private List<BrandName> brandNames;
}