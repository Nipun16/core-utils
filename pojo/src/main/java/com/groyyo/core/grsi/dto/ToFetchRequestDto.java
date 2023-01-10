package com.groyyo.core.grsi.dto;

import com.groyyo.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ToFetchRequestDto {
    private String itemCode;
    private String sourceAddressUuid;
    private List<Department> departmentList;
    private BigDecimal itemsInPackage;
}
