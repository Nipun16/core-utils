package com.groyyo.collector.dto.request;

import com.groyyo.core.enums.ResidenceType;
import com.groyyo.dashboard.dto.BaseRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class GraphRequestDto extends BaseRequestDto {
    boolean inUSD;
    boolean isMovedIn;
    @NotNull
    List<ResidenceType> residenceTypeList;
}
