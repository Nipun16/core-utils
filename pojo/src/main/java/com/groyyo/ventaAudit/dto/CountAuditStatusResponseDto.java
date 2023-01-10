package com.groyyo.ventaAudit.dto;

import com.groyyo.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountAuditStatusResponseDto {
    AuditStatus auditStatus;
    Long count;
}
