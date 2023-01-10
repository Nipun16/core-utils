package com.groyyo.sfr.dto.propertyType;

import com.groyyo.sfr.enumeration.ModuleNames;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModuleUpdateDto {

    private String propertyUuid;
    private ModuleNames moduleName;
}
