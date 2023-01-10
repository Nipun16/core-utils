package com.groyyo.productmix.dto.meta;

import com.groyyo.core.enums.ResidenceBrand;
import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.enums.PropertyTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DropDownsDto {
    private List<LabelValueDto<PropertyTypeEnum>> propertyType;

    private List<LabelValueDto<ResidenceBrand>> propertyBrand;

    private List<LabelValueDto<String>> roomFeatures;

}
