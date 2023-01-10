package com.groyyo.support.dto;

import com.groyyo.core.base.enums.TicketRaisedForType;
import com.groyyo.core.bookingservice.dto.response.BookingDurationResponseDto;
import com.groyyo.core.bookingservice.dto.response.RoomDetailsDto;
import com.groyyo.core.bookingservice.dto.response.UserDetailResponseDto;
import com.groyyo.support.enums.TicketSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class TicketDetailsDto {

    private String assignedToUuid;

    private String assignedTo;

    private List<SubTicketDto> subTicketDtoList;

    private List<TicketChecklistDetailDto> ticketChecklistDetailDtoList;

    private List<TagDto> tagDtoList;

    private TicketCardDto ticketCardDtoList;

    private TeamDto teamDto;

    private UserDetailResponseDto userDetailResponseDto;
    
    private UserDto ticketCreatedByUserDetailDto;

    private BookingDurationResponseDto bookingDurationResponseDto;

    private RoomDetailsDto roomDetailsDto;

    private ResidentRelationDto residentRelationDto;
    
    private TicketRaisedForType raisedForType;

    @Builder.Default
    private boolean canEdit = false;

    @Builder.Default
    private boolean isFreeTextAccess = true;

    private List<TicketFilterCountDto> ticketFilterCountDtos;

    private boolean isAllChecklistClosed;

    private TicketSource ticketSource;
}
