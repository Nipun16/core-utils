package com.groyyo.search.medulla.dtos;


import com.groyyo.core.base.enums.Department;
import com.groyyo.core.dto.PageAndSortDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemSearchRequetDto {
    private String searchText;
    private Department department;
    private String itemCategory;
    private String itemSubCategory;
    private String itemCostHead;
    private PageAndSortDto pageDto;
    private String[] fieldsNeeded;
}
