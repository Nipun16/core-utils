package com.groyyo.productmix.dto.productmix;

import com.groyyo.productmix.dto.LabelValueDto;
import com.groyyo.productmix.dto.roomtemplate.ConsumablesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTemplateTypeOptionsData {

    private List<LabelValueDto<String>> roomFeatures;

    private List<ConsumablesDto> consumables;
}
