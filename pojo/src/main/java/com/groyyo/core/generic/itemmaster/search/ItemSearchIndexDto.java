package com.groyyo.core.generic.itemmaster.search;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.base.common.dto.AbstractSearchIndexDto;
import com.groyyo.core.base.enums.Department;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.core.generic.enums.GSTSlabs;
import com.groyyo.core.generic.itemmaster.enums.ItemAction;
import com.groyyo.item_master.enums.FarCategory;
import com.groyyo.transformations.enums.UnitType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemSearchIndexDto extends AbstractSearchIndexDto {

    private Department department;
    private ItemAction itemAction;

    private UIKeyValue itemCategory;
    private UIKeyValue itemSubCategory;
    private UIKeyValue itemCostHead; // costHeadlabel would be label, costHead will be value

    private String itemName;
    private String itemDescription;
    private String itemCode;
    private GSTSlabs gstSlab;
    private List<UIKeyValue> usageTypeOrArea;
    private UnitType unitOfMeasurement;
    private String glCode;
    private String recipeTag;
	
    private FarCategory farCategory;
    
    private String itemNameSearch;
    private String itemNameSuggest;

    private String itemCodeSearch;
    private String itemDescriptionSearch;

    private String substituteItem;
    private UnitType recipeUom;
    private Double conversionFactor;

    private UnitType standardUom;
    private Double standardQuantity;
    private String itemImage;
    private String genericItemName;

}
