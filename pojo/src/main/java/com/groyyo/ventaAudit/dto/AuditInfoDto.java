package com.groyyo.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditInfoDto {
    private String auditOwner;
    private Date auditDate;
    private String entityName;
    private String roomNumber;
    private List<AuditInventoryInfoDto> auditInventoryInfoDtoList;

}
