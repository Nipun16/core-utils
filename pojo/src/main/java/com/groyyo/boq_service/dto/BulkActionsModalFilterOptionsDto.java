package com.groyyo.boq_service.dto;

import com.groyyo.core.boq_service.enums.BoqItemProvider;
import com.groyyo.core.enums.PropertyEntityType;
import com.groyyo.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BulkActionsModalFilterOptionsDto {
    private List<LabelValueDto<Long>> cities;

    private List<LabelValueDto<String>> microMarkets;

    private List<LabelValueDto<PropertyEntityType>> propertyTypes;

    private List<LabelValueDto<BoqItemProvider>> doneBy;

    private List<LabelValueDto<AreaOfUse>> usedByArea;
}
