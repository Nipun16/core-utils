package com.groyyo.sfr.dto.reviewTemplate;

import com.groyyo.designservice.response.dto.LeadershipBedTypeCountResponseDto;
import com.groyyo.designservice.response.dto.LeadershipFloorBedTypeDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BedCountInfoDto {
    private LeadershipBedTypeCountResponseDto bedTypeInfo;
    private List<LeadershipFloorBedTypeDto> floorDesignInfo;
}
