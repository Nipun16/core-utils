package com.groyyo.ventaAudit.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.dto.PageAndSortDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AuditResidentQueryRequestDto extends AbstractDto {
    private String searchKeyword;
    private PageAndSortDto pageDto;
}