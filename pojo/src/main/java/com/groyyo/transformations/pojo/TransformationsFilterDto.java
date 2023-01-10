package com.groyyo.transformations.pojo;

import java.util.List;

import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.item_master.enums.SortDirection;
import com.groyyo.transformations.enums.SortByKey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransformationsFilterDto {

	private List<UIKeyValue> groyyoCity;
	private List<UIKeyValue> groyyoCluster;
	private List<UIKeyValue> zone;
	private List<UIKeyValue> geographicalCity;
	private List<UIKeyValue> residences;
	private SortDirection sortBy;
	private SortByKey sortKey;
	private String searchUuid;
	private List<UIKeyValue> status;

}
