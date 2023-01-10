package com.groyyo.booking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.groyyo.core.base.GroyyoConstants;
import com.groyyo.core.base.utils.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VasDto {

    private  String vasUuid;
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = GroyyoConstants.IST_TIMEZONE)
    private Date optInDate;
    @JsonFormat(pattern = DateUtil.yyyy_MM_dd_FORMAT, timezone = GroyyoConstants.IST_TIMEZONE)
    private  Date optOutDate;
}
