package com.groyyo.search.medulla.dtos;


import java.util.List;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.dto.PageAndSortDto;
import com.groyyo.core.far.enums.AssetType;
import com.groyyo.core.generic.dto.UIKeyValue;
import com.groyyo.core.po.generic.enums.GenericPOType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoSearchRequetDto {
    private String searchText;
    private String userRole;
    private Department department;
    private Boolean po;
    private String sourceLocationUuid;
    private String deliveryLocationUuid;
    private String deliveryLocationType;
    private List<UIKeyValue> poStatus;
    private List<GenericPOType> poTypes;
    private String listingType;
    private PageAndSortDto pageDto;
    private String[] fieldsNeeded;
    private String sourceOrVendorUuid;
    private Double maxGsriPct;
    private Double minGsriPct;
    private AssetType assetType;
}
