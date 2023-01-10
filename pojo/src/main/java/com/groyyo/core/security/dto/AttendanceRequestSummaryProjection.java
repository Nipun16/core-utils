package com.groyyo.core.security.dto;

import com.groyyo.core.security.enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestSummaryProjection {

    private RequestStatus requestStatus;

    private Long statusCount;
}
