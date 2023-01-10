package com.groyyo.estate_v2.dto;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.dto.SortDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TemplateFilterDto extends PaginationRequest {
    private List<SortDto> sort;
    private FilterTemplateDto filter;
}