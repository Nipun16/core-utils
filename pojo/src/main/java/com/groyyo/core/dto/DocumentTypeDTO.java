package com.groyyo.core.dto;

import com.groyyo.core.enums.DocumentTypeEnum;
import com.groyyo.core.enums.Nationality;
import com.groyyo.core.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentTypeDTO {

    private Long id;

    private String uuid;

    private String name;

    private String description;

    private Nationality nationality;

    private UserType userType;

    private DocumentTypeEnum key;
}