package com.groyyo.sfr.dto.reviewTemplate;

import com.groyyo.sfr.enumeration.Status;
import com.groyyo.sfr.dto.propertyOnboarding.PropertyNameDto;
import com.groyyo.sfr.dto.questionTemplate.ApplicableStatusesDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewTemplateResponseDto {
    private String name;
    private PropertyNameDto finalName;
    private String propertyStatus;
    private String id;
    private String propertyTypeUuid;
    private Status templateStatus;
    private List<ApplicableStatusesDto> propertyStatuses;
    private BasicInfoResponse basicInformation;
    private List<OtherInformationResponse> otherInformation;
    private boolean atlDocumentVisible;
    private boolean bedCountDetailsVisible;
    private boolean salesReviewVisible;
    private boolean propertyNaming;
    private boolean l1CallBackVisible;
    private boolean l2CallBackVisible;
    private boolean bypassVisible;
    private BedCountInfoDto bedCountInformation;
    private List<LayoutResponse> layouts;
    private String propertyAction;
    private String moduleName;

}
