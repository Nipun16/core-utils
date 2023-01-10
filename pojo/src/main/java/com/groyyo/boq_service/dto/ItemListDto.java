package com.groyyo.boq_service.dto;

import com.groyyo.core.boq_service.enums.BoqItemProvider;
import com.groyyo.item_master.enums.ItemType;
import com.groyyo.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemListDto {

    private String itemUuid;
    private String itemCode;
    private BigDecimal quantity;
    private AreaOfUse areaOfUse;
    private BoqItemProvider doneBy;
    private ItemType itemType;
    private BigDecimal llrate;
    private BoqItemProvider budgetDoneBy;
}
