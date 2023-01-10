package com.groyyo.core.po.generic.dtos;

import com.groyyo.boq_service.enums.BoqLabel;
import com.groyyo.core.base.enums.Department;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.core.generic.enums.GSTSlabs;
import com.groyyo.core.generic.itemmaster.enums.ItemType;
import com.groyyo.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PoItemDetail {

    private Department itemDept;
    private String itemUuid;
    private String code;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private UIKeyValue costHead;
    private ItemType itemType;
    private String name;
    private GSTSlabs slab;
    private UnitType uom;
    private String hsnSacCode;
    private String description;
    private BigDecimal quantity;
    private BigDecimal rentPeriod;
    private BigDecimal unitRate;
    private BigDecimal gst;
    @Builder.Default
    private BoqLabel boqLabel = BoqLabel.NA;
}
