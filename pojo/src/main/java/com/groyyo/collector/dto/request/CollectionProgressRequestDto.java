package com.groyyo.collector.dto.request;

import com.groyyo.core.enums.ResidenceType;
import com.groyyo.dashboard.dto.BaseRequestDto;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString(callSuper = true)
public class CollectionProgressRequestDto extends BaseRequestDto {
    @NotNull(message = "ResidenceTypeList must not be null")
    List<ResidenceType> residenceTypeList;
}
