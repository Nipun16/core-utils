package com.groyyo.boq_service.dto;

import com.groyyo.boq_service.enums.BoqLabel;
import com.groyyo.core.boq_service.enums.BoqType;
import com.groyyo.item_master.enums.ItemType;
import com.groyyo.transformations.enums.BoqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalListingFilterOptionsDto {

    private List<LabelValueDto<BoqType>> boqType;

    private List<LabelValueDto<BoqStatus>> boqStatus;

    private List<LabelValueDto<BoqLabel>> boqLabel;

    private List<LabelValueDto<BoqStatus>> boqStatusOptions;

    private List<LabelValueDto<ItemType>> boqCapexType;

    private List<LabelValueDto<String>> city;

    private List<LabelValueDto<String>> createdBy;

    private List<LabelValueDto<String>> approvedBy;

    private List<LabelValueDto<String>> lastUpdatedBy;
}
