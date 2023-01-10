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
public class BoqListingGroupByItemTempDto {
    private String itemCode;

    private ItemType category;

    private String subCategory;

    private String itemUuid;

    private BigDecimal slQuantity;

    private BigDecimal llQuantity;

    private BigDecimal amount;

    private String boqName;

    private AcquisitionType acquisitionType;

    private UnitType orderUnit;

    private AreaOfUse areaOfUse;

    private BigDecimal gcQuantity;

    private String imageUrl;
}
