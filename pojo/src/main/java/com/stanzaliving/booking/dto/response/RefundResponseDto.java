package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.BookingStatus;
import com.stanzaliving.booking.enums.BookingSubStatus;
import com.stanzaliving.booking.enums.BookingType;
import lombok.Getter;

import java.util.Date;
import java.util.Map;

@Getter
public class RefundResponseDto {

    private String bookingUuid;
    private BookingStatus bookingStatus;
    private BookingSubStatus bookingSubStatus;
    private BookingType bookingType;
    private String userUuid;
    private Date contractStartDate;
    private Date contractEndDate;
    private String roomNumber;
    private String occupancyName;
    private String residentId;
    private String residenceName;
    private String microMarketName;
    private String cityName;
    private Map<String, SdRefundDetailsDto> bookingExitDetails;
}
