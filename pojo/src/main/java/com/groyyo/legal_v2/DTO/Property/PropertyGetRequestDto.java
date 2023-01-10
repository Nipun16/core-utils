package com.groyyo.legal_v2.DTO.Property;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.dto.SortDto;
import com.groyyo.legal_v2.DTO.Filters.FilterPropertyDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PropertyGetRequestDto extends PaginationRequest {

    private List<SortDto> sort;

    private FilterPropertyDto filter;
}
