package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.EventDataType;
import com.groyyo.genericdashboard.enums.EventDurationType;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CampaignEventAttributesDto{

    private String uuid;

    private String attributeName;

    private String attributeValue;

    private String operation;

    private EventDataType eventDataType;
    
    @Builder.Default
    private EventDurationType eventDurationType=EventDurationType.FIXED_DURATION;
}
