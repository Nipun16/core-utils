package com.groyyo.support.dto;

import com.groyyo.core.base.enums.AccessLevel;
import com.groyyo.support.enums.ReminderActionType;
import com.groyyo.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderRuleDto {

    private TicketType ticketType;
    private String primaryReferenceUuid;
    private AccessLevel accessLevel;
    private String referenceUuid;
    private Long sendReminderIn;
    private String sendReminderTo;
    private ReminderActionType sendReminderWhen;
    private String groupUuid;

}
