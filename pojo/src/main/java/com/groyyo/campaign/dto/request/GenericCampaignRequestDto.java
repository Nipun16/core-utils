package com.groyyo.campaign.dto.request;

import com.groyyo.campaign.dto.CampaignDto;
import com.groyyo.core.enums.ResidenceUserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class GenericCampaignRequestDto extends CampaignDto {

    @Builder.Default
    boolean optional = true;

    ResidenceUserType residenceUserType;

    List<String> userUuidList;

}
