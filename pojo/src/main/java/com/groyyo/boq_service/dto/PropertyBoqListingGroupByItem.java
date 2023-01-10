package com.groyyo.boq_service.dto;

import com.groyyo.item_master.enums.AcquisitionType;
import com.groyyo.item_master.enums.ItemType;
import com.groyyo.transformations.enums.AreaOfUse;
import com.groyyo.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyBoqListingGroupByItem {
    private String itemCode;

    private ItemType category;

    private String subCategory;

    private String itemName;

    private QuantityInfoDto quantityInfo;

    private BigDecimal totalAmount;

    private int numberOfBoqs;

    private AreaOfUse areaOfUse;

    private AcquisitionType acquisitionType;

    private UnitType orderUnit;

    private String itemUuid;

    private String imageUrl;
}
