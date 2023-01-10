package com.groyyo.core.security.dto;

import com.groyyo.core.security.enums.AttendanceActionType;
import com.groyyo.core.security.enums.UserActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceActivityTypeDTO {

    private String uuid;
    private UserActionType userActionType;
    private AttendanceActionType attendanceActionType;
    private String description;
}