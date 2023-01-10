package com.groyyo.productmix.dto.productmix;

import com.groyyo.productmix.dto.ApplicableDurationDto;
import com.groyyo.productmix.enums.TemplateStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMixListingDto {
    private String productMixUuid;

    private String actionedBy;

    private LocalDateTime actionedAt;

    private ApplicableDurationDto applicableDuration;

    private String backgroundColor;

    private String textColor;

    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;

    private LocalDateTime updatedAt;

    private Long noOfRooms;

    private String productMixName;

    private String productMixStatus;

    private TemplateStatus productMixStatusValue;

    private String productMixId;
}
