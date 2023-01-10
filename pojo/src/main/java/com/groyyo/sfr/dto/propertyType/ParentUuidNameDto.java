package com.groyyo.sfr.dto.propertyType;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ParentUuidNameDto {
    private String uuid;
    private String name;
}
