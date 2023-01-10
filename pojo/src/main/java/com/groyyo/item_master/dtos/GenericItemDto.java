package com.groyyo.item_master.dtos;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.item_master.enums.FarCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenericItemDto {

    private Department department;
    private UIKeyValue costHead;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private String itemUuid;
    private String itemCode;
    private String oldItemCode;
    private String itemName;
    private String itemDescription;
    private String itemModel;
    private String glCode;
    private UIKeyValue itemType;
    private UIKeyValue uom;
    private UIKeyValue brand;
    private String hsnSacCode;
    private UIKeyValue gstSlabs;
    private Double cgst;
    private Double sgst;
    private Double igst;
    private Boolean inactive;
    private FarCategory farCategory;
    private Boolean taggable;
    //Rates
    private BigDecimal globalRate;
    private BigDecimal cityRate;
    private String recipeTag;

}
