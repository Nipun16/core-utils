package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.CampaignDashboardType;
import com.groyyo.genericdashboard.enums.CampaignStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignFilterDto {

    private List<CampaignDashboardType> campaignType;

    private List<CampaignStatus> campaignStatus;

    private AudienceLocationDto audienceLocation;

    private DateRangeDto startDateRange;

    private DateRangeDto endDateRange;
}
