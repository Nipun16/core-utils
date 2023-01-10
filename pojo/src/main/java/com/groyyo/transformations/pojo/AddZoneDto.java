package com.groyyo.transformations.pojo;

import com.groyyo.core.generic.dto.UIKeyValue;
import lombok.*;

import java.util.List;


@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddZoneDto {

    private String zoneUuid;
    private String zoneName;
    private UIKeyValue status;
    private List<UIKeyValue> groyyoCity;
    private List<UIKeyValue> statusOptions;
    private List<UIKeyValue> groyyoCityOptions;
}
