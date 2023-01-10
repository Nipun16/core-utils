package com.groyyo.ledger.dto;

import com.groyyo.ledger.enums.SettleLedgerActionStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class TotalLedgerBalanceDto {

    private String referenceId;
    private Double totalBalance;
    private SettleLedgerActionStatus settleLedgerActionStatus;
}

