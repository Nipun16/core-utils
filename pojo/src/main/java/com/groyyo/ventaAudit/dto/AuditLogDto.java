package com.groyyo.ventaAudit.dto;


import com.groyyo.ventaAudit.enums.AuditAction;
import com.groyyo.ventaAudit.enums.DamageAssessed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditLogDto {
    private LocalDate date;
    private AuditAction auditAction;
    private String actionBy;
    private String auditRejectionReason;
    private DamageAssessed damageAssessed;
    private Double damageAmount;
}
