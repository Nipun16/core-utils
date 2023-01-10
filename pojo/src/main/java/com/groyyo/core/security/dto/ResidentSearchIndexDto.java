package com.groyyo.core.security.dto;

import com.groyyo.core.base.common.dto.AbstractSearchIndexDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentSearchIndexDto extends AbstractSearchIndexDto {
    private String firstName;
    private String lastName;
    private String roomNumber;
    private String residentId;
    private String residenceUuid;
    private String phoneType;
}
