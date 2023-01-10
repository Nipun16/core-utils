package com.groyyo.productmix.dto.roomtemplate.consumables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryConsumableTagDto {
    private String consumableTag;

    private String category;
}
