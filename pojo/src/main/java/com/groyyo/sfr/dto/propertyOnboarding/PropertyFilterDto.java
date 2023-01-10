package com.groyyo.sfr.dto.propertyOnboarding;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.dto.SortDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PropertyFilterDto  extends PaginationRequest {
    private List<SortDto> sort;
    private FilterPropertyDto filter;
}
