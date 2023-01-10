package com.groyyo.support.dto;

import com.groyyo.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    private AccessLevel accessLevel;
    private String accessLevelUuid;

    public LocationDto(String name, String uuid) {
        this.accessLevel = AccessLevel.valueOf(name);
        this.accessLevelUuid = uuid;
    }
}
