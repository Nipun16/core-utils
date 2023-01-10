package com.groyyo.collector.dto.response;

import com.groyyo.dashboard.dto.FeElementDto;
import com.groyyo.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class IssueProgressResponseDto {
    String issue;
    FeElementDto inputDateAmountDue;
    FeElementDto inputDateResidentsCount;
    FeElementDto currDatePaidInFullAmount;
    FeElementDto currDatePaidInFullCount;
    FeElementDto currDatePartialPaidAmount;
    FeElementDto currDatePartialPaidCount;
    FeElementDto currDateNotPaidAmount;
    FeElementDto currDateNotPaidCount;
}
