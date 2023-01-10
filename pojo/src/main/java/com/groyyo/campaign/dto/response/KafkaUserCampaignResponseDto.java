package com.groyyo.campaign.dto.response;

import com.groyyo.campaign.enums.CampaignType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class KafkaUserCampaignResponseDto extends UserCampaignResponseDto {

    String residenceUuid;

    CampaignType campaignType;

    String campaignSubType;
}
