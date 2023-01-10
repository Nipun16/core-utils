package com.groyyo.core.dto;

import com.groyyo.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsSummaryProjection {

    private Long documentCount = 0L;

    private ApprovalStatus approvalStatus;
}