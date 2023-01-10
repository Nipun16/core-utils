package com.groyyo.collector.dto.response;


import com.groyyo.dashboard.dto.FeElementDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RentSummaryResponseDto {
    FeElementDto payable;
    FeElementDto pending;
    FeElementDto arrears;
    FeElementDto totalPending;
    String payableMsg;
    String pendingMsg;
    String arrearsMsg;
    String totalPendingMsg;
}
