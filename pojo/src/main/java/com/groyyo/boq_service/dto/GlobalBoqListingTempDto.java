package com.groyyo.boq_service.dto;

import com.groyyo.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalBoqListingTempDto {

    private String propertyUuid;

    private Long micromarketId;

    private String cityUuid;

    private Integer numberOfBeds;

    private BigDecimal capex;

    private BoqStatus boqStatus;
}