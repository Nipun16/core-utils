package com.groyyo.po.model;

import com.groyyo.po.enums.POSummaryStatus;
import com.groyyo.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PropertyPoStatusSummaryDto {
    PoType poType;
    POSummaryStatus poSummaryStatus;
}
