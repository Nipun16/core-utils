package com.groyyo.boq_service.dto.groundrequest;

import com.groyyo.boq_service.enums.GroupByEnum;
import com.groyyo.item_master.enums.ItemType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingRequestDto {

    @Builder.Default
    private GroupByEnum groupBy = GroupByEnum.SUBCATEGORY;

    private String propertyUuid;

    private List<ItemType> filterItemsBy;

    private String searchKeyword;
}
