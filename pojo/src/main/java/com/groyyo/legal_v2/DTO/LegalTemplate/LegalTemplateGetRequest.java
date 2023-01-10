package com.groyyo.legal_v2.DTO.LegalTemplate;

import com.groyyo.core.base.common.dto.PaginationRequest;
import com.groyyo.core.dto.SortDto;
import com.groyyo.legal_v2.DTO.Filters.FilterLegalTemplateDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LegalTemplateGetRequest extends PaginationRequest {

    private List<SortDto> sort;

    private FilterLegalTemplateDTO filter;

}
