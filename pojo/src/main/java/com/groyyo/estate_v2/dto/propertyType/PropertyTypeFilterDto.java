package com.groyyo.estate_v2.dto.propertyType;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.dto.SortDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PropertyTypeFilterDto extends PaginationRequest {
    private String expand;
    private List<SortDto> sort;
    private FilterPropertyTypeDto filter;
}
