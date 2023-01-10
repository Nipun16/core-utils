package com.groyyo.productmix.dto.propertytemplate;

import com.groyyo.core.enums.ResidenceBrand;
import com.groyyo.productmix.enums.PropertyTypeEnum;
import com.groyyo.productmix.dto.ApplicableDurationDto;
import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTemplateListingFilterDto {

    private String uuid;

    private List<LabelValueDto<TemplateStatus>> templateStatus;

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> actionedBy;

    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<LabelValueDto<String>> zones;

    private List<LabelValueDto<String>> attributes;

    private ApplicableDurationDto applicableDuration;

    @Builder.Default
    private int pageNo = 1;

    @Builder.Default
    private int pageSize = 20;

    @Builder.Default
    private String sortBy = "updatedAt";

    @Builder.Default
    private String sortOrder = "desc";
}
