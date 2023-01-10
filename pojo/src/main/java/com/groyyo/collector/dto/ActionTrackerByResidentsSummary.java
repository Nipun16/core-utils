package com.groyyo.collector.dto;

import com.groyyo.dashboard.dto.FeElementDto;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ActionTrackerByResidentsSummary {
    FeElementDto totalPending;
    @Builder.Default
    Double totalPendingAmount = 0d;
    @Builder.Default
    Integer duesAndNoTaskAssigned = 0;
    @Builder.Default
    Integer todayFollowUp = 0;
}
