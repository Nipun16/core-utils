package com.groyyo.core.projectservice.tiles;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.projectservice.enums.PropertyUpdateEnum;
import com.groyyo.core.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TileDeciderDto {
    private String propertyUuid;
    private UserType userType;
    private String userUuid;
    private Department department;
    private List<PropertyUpdateEnum> propertyUpdateEnums;
}
