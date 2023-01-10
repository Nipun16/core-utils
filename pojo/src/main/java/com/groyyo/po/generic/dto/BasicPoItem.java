package com.groyyo.po.generic.dto;

import com.groyyo.boq_service.enums.BoqLabel;
import com.groyyo.core.base.utils.GroyyoUtils;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BasicPoItem {
    @EqualsAndHashCode.Include
    private String itemUuid;

    private UIKeyValue costHead;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private UIKeyValue itemType;
    private String itemCode;
    private String itemName;
    private String itemDesc;
    private UnitType uom;
    private String uomText;
    private String hsnSacCode;
    private BigDecimal maxUnitRate;
    private BigDecimal boqRate;
    private BigDecimal unitRate;//Will be same as rent per month
    private BigDecimal quantity;
    private UIKeyValue gstSlabs;
    private Double gstPct;
    private BigDecimal itemAmount;

    @EqualsAndHashCode.Include
    @Builder.Default
    private BoqLabel boqLabel = BoqLabel.NA;

    //For ShortClose
    private BigDecimal gsriQuantity;
    private BigDecimal currentPoQuantity;
    private BigDecimal currentItemAmount;

    //For Rental
    private BigDecimal rentPeriod;
    private UIKeyValue refundSDType; //Todo: send it as UiKeyValue
    private BigDecimal refundSDValue;

    //For Property Boq Items
    @Builder.Default
    private BigDecimal maxQuantity=GroyyoUtils.getBigDecimalValueOf("-1.0");

    //For TO
    private BigDecimal effectivePrice;
    private BigDecimal openingQuantity;
    private BigDecimal blockedQuantity;
    private BigDecimal availableQuantity;
    private String error;

}
