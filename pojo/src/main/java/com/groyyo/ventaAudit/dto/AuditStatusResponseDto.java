package com.groyyo.ventaAudit.dto;

import com.groyyo.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditStatusResponseDto {
    private AuditStatus auditStatus;
    private String auditUuid;
    private LocalDate auditedOn;
    private LocalDate auditedScheduledOn;
    private String auditorUuid;
    private String auditRejectionReason;
    private String auditorContactNo;
}
