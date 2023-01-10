package com.groyyo.boq_service.dto;

import com.groyyo.boq_service.enums.BulkActionSubmitCallback;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubmitCallBackDto {
    private Map<String, BoqLevelActionsDto> properties;

    private BulkActionSubmitCallback action;

    private Boolean isFilterSelected;
}
