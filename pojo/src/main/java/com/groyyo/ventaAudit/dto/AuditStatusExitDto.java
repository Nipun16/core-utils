package com.groyyo.ventaAudit.dto;

import com.groyyo.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditStatusExitDto {
    private AuditStatus auditStatus;
    private String bookingUuid;
    private String roomUuid;
    private String auditUuid;
}
