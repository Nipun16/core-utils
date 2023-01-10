package com.groyyo.core.dto;

import com.groyyo.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentApprovalNotificationProducerDTO {
    private ApprovalStatus approvalStatus;

    private String approvedBy;

    private LocalDate approvalDate;

    private String rejectedBy;

    private LocalDate rejectionDate;

    private String rejectionReason;

    private String documentUuid;

    private LocalDate updatedAt;
}
