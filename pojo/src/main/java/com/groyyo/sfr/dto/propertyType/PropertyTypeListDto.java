package com.groyyo.sfr.dto.propertyType;

import com.groyyo.sfr.enumeration.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyTypeListDto {
    private String label;
    private String value;
    private Status status;
}
