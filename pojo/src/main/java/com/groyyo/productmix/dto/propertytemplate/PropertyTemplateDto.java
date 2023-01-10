package com.groyyo.productmix.dto.propertytemplate;

import com.groyyo.core.enums.ResidenceBrand;
import com.groyyo.productmix.dto.ApplicableDurationDto;
import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.enums.PropertyTypeEnum;
import com.groyyo.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Note: Any fields modified in this class should also be modified in
 * com.groyyo.productmix.dto.propertytemplate.PropertyTemplateDtoWithValidations
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateDto {
    private String uuid;

    private String templateName;

    private ApplicableDurationDto applicableDuration;

    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<ZonesDto> zones;

    private LabelValueDto<TemplateStatus> templateStatus;

    private Boolean isActive;

    private String backgroundColor;

    private String textColor;

    private String templateId;

    private String actionedBy;

    private LocalDateTime actionedAt;

    private boolean canEdit;

    private boolean canApprove;
}
