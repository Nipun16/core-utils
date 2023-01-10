package com.groyyo.collector.dto;

import com.groyyo.dashboard.dto.FeElementDto;
import com.groyyo.dashboard.dto.GraphLineYPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GraphLineYPointRentDashboard extends GraphLineYPoint {
    Double y;
    FeElementDto amount;
    Double percent;
    String heading;
}