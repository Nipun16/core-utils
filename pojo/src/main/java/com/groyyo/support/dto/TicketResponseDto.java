package com.groyyo.support.dto;

import com.groyyo.core.base.enums.TicketRaisedForType;
import com.groyyo.support.enums.Priority;
import com.groyyo.support.enums.Source;
import com.groyyo.support.enums.TicketSource;
import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TicketResponseDto {

    private String subCategoryUuid;

    private String subCategory;

    private String categoryUuid;

    private String category;

    private String complaintGroupUuid;

    private String complaintGroup;

    private Date slaTime;

    private String chipColor;

    private String description;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private UserResidenceDto raisedFor;
    
    private UserResidenceDto createdByDetail;
    
    private TicketRaisedForType raisedForType;
    
    private String assignedToUuid;

    private String assignedTo;

    private String status;

    private String statusUuid;

    private Long id;

    private String uuid;

    private Source source;

    private Priority priority;

    private String residenceUuid;

    private TicketSource ticketSource;

    private String currentResolutionLevelUuid;

    private String ticketId;

    private Integer version;

    private Date alfredSlaTime;

}
