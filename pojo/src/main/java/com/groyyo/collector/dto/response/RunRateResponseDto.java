package com.groyyo.collector.dto.response;

import com.groyyo.dashboard.dto.GraphDto;
import com.groyyo.dashboard.dto.HistogramDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class RunRateResponseDto {
    GraphDto graphDto;
    HistogramDto histogramDto;
}
