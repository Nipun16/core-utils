package com.groyyo.invoice.dto;

import com.groyyo.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author nipunaggarwal
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceMaxApprovalLevelDto {
    private Department department;

    private Integer maxApprovalLevel;

    private int financeApprovalAt;
}
