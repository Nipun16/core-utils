package com.groyyo.support.dto;

import com.groyyo.support.enums.TicketActivityTemplatesEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternalKafkaDto {

    private Object object;
    private TicketActivityTemplatesEnum eventType;
}
