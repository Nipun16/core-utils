package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.EventDataType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventAttributesDto {

    private String uuid;

    private String eventNameId;

    private String name;

    private EventDataType eventDataType;
}
