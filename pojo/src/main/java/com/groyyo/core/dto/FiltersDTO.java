package com.groyyo.core.dto;


import com.groyyo.core.enums.ApprovalStatus;
import com.groyyo.core.enums.DocumentTypeEnum;
import com.groyyo.core.enums.Nationality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FiltersDTO {
    private List<String> residents;

    private List<String> cities;

    private List<String> micromarkets;

    private List<String> residences;

    private ApprovalStatus approvalStatus;

    private List<Nationality> nationalities;

    private List<DocumentTypeEnum> documentTypes;
}