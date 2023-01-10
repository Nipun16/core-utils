package com.groyyo.ventaAudit.dto;

import com.groyyo.core.base.common.dto.AbstractSearchIndexDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditResidentSerachIndexDto extends AbstractSearchIndexDto {
    private String residentId;
    private String residentName;
}