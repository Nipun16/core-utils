package com.groyyo.core.security.dto;

import com.groyyo.core.security.enums.RequestReason;
import com.groyyo.core.security.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceRequestReasonTypeDTO {

    private String uuid;

    private RequestType requestType;

    private RequestReason reasonType;

    private String description;
}
