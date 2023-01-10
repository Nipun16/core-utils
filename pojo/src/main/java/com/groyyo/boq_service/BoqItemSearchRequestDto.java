package com.groyyo.boq_service;

import com.groyyo.core.base.enums.Department;
import com.groyyo.item_master.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoqItemSearchRequestDto {

    private ItemType itemType;

    private String itemSpec;

    private String particular;

    private String itemCode;

    private String categoryUuid;

    private Department department;

    private String categoryName;

}
