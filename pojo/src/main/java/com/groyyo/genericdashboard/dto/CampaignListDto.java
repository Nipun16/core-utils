package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.CampaignDashboardType;
import com.groyyo.genericdashboard.enums.CampaignGroup;
import com.groyyo.genericdashboard.enums.CampaignStatus;
import com.groyyo.genericdashboard.enums.SchedulingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignListDto {

    private String uuid;

    private String campaignName;

    private CampaignDashboardType campaignType;

    private CampaignGroup campaignGroup;

    private Integer priorityOrder;

    private SchedulingType schedulingType;

    private CampaignStatus campaignStatus;

    private String createdBy;

    private Date createdAt;

    private Date startDate;

    private Date endDate;
}
