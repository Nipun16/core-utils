package com.groyyo.collector.dto.request;

import com.groyyo.collector.enums.AdjustedType;
import com.groyyo.collector.enums.LabelType;
import com.groyyo.core.enums.ResidenceType;
import com.groyyo.dashboard.dto.BaseRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class RentDashboardRequestDto extends BaseRequestDto {

    @NotNull
    List<ResidenceType> residenceTypeList;
    @NotNull
    AdjustedType adjustedType;
    @NotNull
    LabelType labelType;
    Boolean inUSD;
}
