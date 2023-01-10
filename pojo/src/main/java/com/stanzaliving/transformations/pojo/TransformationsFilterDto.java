package com.stanzaliving.transformations.pojo;

import java.util.List;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.item_master.enums.SortDirection;
import com.stanzaliving.transformations.enums.SortByKey;

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

	private List<UIKeyValue> stanzaCity;
	private List<UIKeyValue> stanzaCluster;
	private List<UIKeyValue> zone;
	private List<UIKeyValue> geographicalCity;
	private List<UIKeyValue> residences;
	private SortDirection sortBy;
	private SortByKey sortKey;
	private String searchUuid;
	private List<UIKeyValue> status;

}
