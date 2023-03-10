package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.EventType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CampaignEventsDto {

    private String uuid;

    private String eventName;
    
    private String campaignId;

    private String eventCategoryName;

    private EventType eventType;

    private List<CampaignEventAttributesDto> eventAttributesDtos;

    private String relationshipOperator;
  
}
