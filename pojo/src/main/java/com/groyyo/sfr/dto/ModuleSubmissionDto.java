package com.groyyo.sfr.dto;

import com.groyyo.sfr.enumeration.ModuleState;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ModuleSubmissionDto {

    private Long moduleSubmissionId;
    
    private ModuleState moduleStatus;

    private String questionTemplateId;

}
