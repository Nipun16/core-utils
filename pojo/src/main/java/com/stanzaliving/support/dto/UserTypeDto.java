package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTypeDto {

    private List<String> assignedTo;

    private List<String> updatedBy;

    private List<String> resolvedBy;
}
