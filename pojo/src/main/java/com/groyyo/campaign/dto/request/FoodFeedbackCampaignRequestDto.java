package com.groyyo.campaign.dto.request;

import com.groyyo.campaign.dto.CampaignDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FoodFeedbackCampaignRequestDto extends CampaignDto {
  @NotEmpty(message = "userBlockerMap must not be empty") Map<String, Boolean> userBlockerMap;
}
