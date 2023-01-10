package com.groyyo.core.dto;

import com.groyyo.core.base.common.dto.PaginationRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PageAndSortDto extends PaginationRequest {

	private String sortBy;

	private String sortOrder;

	public void of(SortDto sortDto) {

		setSortBy(sortDto.getSortBy());

		setSortOrder(sortDto.getSortOrder());

	}

}