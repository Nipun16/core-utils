package com.groyyo.item_master.dtos;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.core.leadership.dto.DateRange;
import com.groyyo.item_master.enums.SortDirection;
import com.groyyo.item_master.enums.SortSpecs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FilterItemRecipeTagDto {

    //To send for front end
    private List<UIKeyValue> recipeTagStatusOptions;
    private List<UIKeyValue> recipeTagUomOptions;
    private List<UIKeyValue> updatedByOptions;
    private List<UIKeyValue> createdByOptions;

    //To get from front end filters
    private List<UIKeyValue> recipeTagStatus;
    private List<UIKeyValue> recipeTagUom;

    //more filters
    private List<UIKeyValue> updatedBy;
    private List<UIKeyValue> createdBy;
    private DateRange dateRangeCreatedAt;
    private DateRange lastUpdatedBetween;

    private String recipeTagUuid;


    @Valid
    @NotNull
    private Department department;

    //Sort
    private SortSpecs sortSpecs;
    private SortDirection sortDirection;

    //SearchKey should be a string or UIKeyValue?
    private String searchKey;

    private List<String> availableFields;
}
