package com.groyyo.core.security.dto;

import javax.validation.constraints.NotNull;

import com.groyyo.core.security.enums.NudgeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceNudgeDTO {

    private Long id;

    private String uuid;

    @NotNull private String residentUuid;

    private AttendanceNudgeMetadataDTO metadata;

    private NudgeType nudgeType;
}