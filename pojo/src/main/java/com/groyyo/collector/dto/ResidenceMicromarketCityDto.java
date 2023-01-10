package com.groyyo.collector.dto;

import com.groyyo.core.enums.ResidenceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceMicromarketCityDto {
    String bookingUuid;
    String residenceUuid;
    String micromarketUuid;
    String cityUuid;
    ResidenceType residenceType;
}
