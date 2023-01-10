package com.groyyo.boq_service.dto;

import com.groyyo.boq_service.enums.BoqLabel;
import com.groyyo.core.boq_service.enums.BoqType;
import com.groyyo.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasicInfoDto {
    private String propertyUuid;

    private String boqUuid;

    private Boolean groupByAreaOfUse;

    private LabelValueDto<String> houseName;

    private String boqName;

    private LabelValueDto<BoqType> boqType;

    private LabelValueDto<BoqLabel> boqLabel;

    private LabelValueDto<BoqStatus> boqStatus;

    private boolean canEdit;

    private boolean canApprove;

    private String bgColor;

    private String textColor;
}
