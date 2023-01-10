package com.groyyo.boq_service.dto.groundrequest;

import com.groyyo.item_master.enums.AcquisitionType;
import com.groyyo.item_master.enums.ItemType;
import com.groyyo.transformations.enums.AreaOfUse;
import com.groyyo.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDto {
    private String itemUuid;

    private String itemCode;

    private String itemType;

    private String itemName;

    private AcquisitionType acquisitionType;

    private BigDecimal quantity;

    private String orderUnit;

    private String areaOfUse;

    private String imageUrl;

    private String subCategory;
}
