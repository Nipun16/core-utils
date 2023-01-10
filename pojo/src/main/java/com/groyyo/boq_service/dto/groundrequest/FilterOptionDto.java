package com.groyyo.boq_service.dto.groundrequest;

import com.groyyo.boq_service.dto.LabelValueCountDto;
import com.groyyo.boq_service.dto.LabelValueDto;
import com.groyyo.boq_service.enums.GroupByEnum;
import com.groyyo.item_master.enums.ItemType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterOptionDto {
    private List<LabelValueCountDto<ItemType>> filterItemsBy;

    private List<LabelValueDto<GroupByEnum>> groupBy;
}
