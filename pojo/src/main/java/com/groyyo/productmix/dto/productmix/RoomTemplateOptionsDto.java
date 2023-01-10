package com.groyyo.productmix.dto.productmix;

import com.groyyo.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomTemplateOptionsDto {
    private List<LabelValueDto<String>> roomTemplateOptions;

    private List<LabelValueDto<String>> allConsumablesList;

    private List<LabelValueDto<String>> allRoomFeaturesList;

    private Map<String, RoomsDataCombined> roomTemplateOptionsData;

    private List<RoomDetails> roomDetails;
}
