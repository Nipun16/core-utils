package com.groyyo.ledger.dto;


import com.groyyo.ledger.enums.SettleLedgerActionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RefundRequest {

    private String bookingUuid;

    private double amount;

    private double processedAmount;

    private boolean isNotifyCustomer ;

    private String rejectedReason;

    private SettleLedgerActionStatus settleLedgerActionStatus;

    private String approvedBy;

    private Boolean approvalRequired;

    protected Date approvedAt;

    private String userUuid;

    private String uuid;

}
