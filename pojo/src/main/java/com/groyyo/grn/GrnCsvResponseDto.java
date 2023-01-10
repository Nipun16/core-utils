package com.groyyo.grn;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.po.generic.enums.GenericPOTOStatus;
import com.groyyo.core.po.generic.enums.GenericPOType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class GrnCsvResponseDto {

    private String receivedLocationName;
    private String poNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private GenericPOTOStatus poStatus;
    private GenericPOType poType;
    private BigDecimal poAmount;
    private String poUuid;
    private String vendorUuid;
    private Department department;

    private List<CsvItemInfoDto> itemInfoDtoList;
}
