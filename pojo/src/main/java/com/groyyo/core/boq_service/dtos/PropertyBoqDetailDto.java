package com.groyyo.core.boq_service.dtos;

import com.groyyo.boq_service.enums.BoqLabel;
import com.groyyo.core.boq_service.enums.BoqType;
import com.groyyo.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PropertyBoqDetailDto {
    private String propertyUuid;
    private String propertyBoqUuid;
    private BoqStatus boqStatus;
    private List<PropertyBoqItemDto> items;
    private BoqType boqType;
    @Builder.Default
    private BoqLabel boqLabel = BoqLabel.NA;
}
