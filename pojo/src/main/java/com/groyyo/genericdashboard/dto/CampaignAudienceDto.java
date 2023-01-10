package com.groyyo.genericdashboard.dto;

import com.groyyo.genericdashboard.enums.CampaignAudienceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignAudienceDto {

    @NotNull(message = "Campaign Audience cannot be empty")
    private CampaignAudienceType campaignAudienceType;

    private AudienceLocationDto userLocationData;

    private FileUploadDto fileUploadDto;

    private Long distributionDays;

    private Long numberOfUsers;

    private String uuid;
}
