package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.Frequency;
import com.groyyo.genericdashboard.enums.SchedulingType;
import com.groyyo.genericdashboard.enums.WaitTimeUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingDto {

    @NotNull(message = "Scheduling type cannot be empty")
    private SchedulingType schedulingType;

    private Date startDate;

    private Date endDate;

    private Frequency frequency;

    private List<String> dates;

    private LocalTime scheduledAt;

    private CampaignEventsRequestDto campaignEventsRequestDto;

    private Integer waitTimeValue;

    private WaitTimeUnit waitTimeUnit;

    private String uuid;
}
