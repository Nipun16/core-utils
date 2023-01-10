package com.groyyo.ventaAudit.dto;


import com.groyyo.ventaAudit.enums.AuditStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAuditResponseDto {
    private String auditUuid;
    private  String message;
    private AuditStatus auditStatus;
}