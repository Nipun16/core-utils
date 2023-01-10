package com.groyyo.collector.dto.response;

import com.groyyo.dashboard.dto.FeElementDto;
import com.groyyo.dashboard.dto.RecordDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class RentDetailsResponseDto extends RecordDto {
    FeElementDto payableAmount;
    FeElementDto pendingAmount;
    FeElementDto pendingPercentage;
}
