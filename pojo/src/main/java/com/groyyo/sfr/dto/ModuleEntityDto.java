package com.groyyo.sfr.dto;

import com.groyyo.sfr.enumeration.ModuleState;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ModuleEntityDto {

    private String propertyUuid;

    private Long moduleSubmissionId;

    private String questionTemplateId;
    
    private ModuleState moduleState;

    private LocalDate uploadedAt;

    private LocalDate reviewedAt;

    private String color;

    private  String submissionName;

}
