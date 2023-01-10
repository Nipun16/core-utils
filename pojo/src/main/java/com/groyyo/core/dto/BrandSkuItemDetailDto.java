package com.groyyo.core.dto;

import com.groyyo.core.generic.dto.UIKeyValue;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BrandSkuItemDetailDto {

    private String itemUuid;
    private String itemName;
    private String itemCode;
    private UIKeyValue category;
    private UIKeyValue subCategory;
    private UIKeyValue brand;
    private UIKeyValue uom;

}
