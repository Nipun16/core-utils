package com.groyyo.collector.dto;

import com.groyyo.collector.enums.MaintenanceFeeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCommercialsDto {
    Double maintenanceFeeAmount;
    MaintenanceFeeType maintenanceFeeType;
    Double securityDeposit;
}
