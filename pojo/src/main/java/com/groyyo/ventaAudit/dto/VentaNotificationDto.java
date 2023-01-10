package com.groyyo.ventaAudit.dto;

import com.groyyo.booking.enums.BookingEventEnum;
import com.groyyo.core.pojo.AttachmentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VentaNotificationDto {
    String bookingUuid;
    String residentUuid;
    String auditorUuid;
    Double damageTotalAmount;
    List<AttachmentDto> attachmentDtos;
    BookingEventEnum eventEnum;
    String message;
    Date auditScheduledOn;
    Date auditedOn;
}
