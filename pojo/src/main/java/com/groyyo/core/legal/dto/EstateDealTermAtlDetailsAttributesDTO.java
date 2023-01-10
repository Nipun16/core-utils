package com.groyyo.core.legal.dto;

import com.groyyo.core.estate.dto.EstateAttributeDto;
import com.groyyo.core.estate.dto.EstateDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EstateDealTermAtlDetailsAttributesDTO {
    List<AtlDetailDto> atlDetailDtoList;
    List<DealTermDto> dealTermDtoList;
    List<EstateAttributeDto> estateAttributeDtoList;
    EstateDto estateDto;
}
