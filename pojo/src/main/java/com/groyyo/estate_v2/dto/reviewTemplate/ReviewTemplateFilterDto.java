package com.groyyo.estate_v2.dto.reviewTemplate;

import com.groyyo.core.dto.SortDto;
import com.groyyo.core.user.acl.dto.UserDeptLevelRoleNameUrlExpandedDto;
import com.groyyo.estate_v2.dto.reviewTemplate.filter.DynamicFilterResponseDTO;
import com.groyyo.estate_v2.dto.reviewTemplate.filter.PropertyResponseFilterDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ReviewTemplateFilterDto extends UserDeptLevelRoleNameUrlExpandedDto {
    private SortDto sort;
    private int pageNo;
    private int limit;
    private PropertyResponseFilterDto moreFilters;
    private List<DynamicFilterResponseDTO> dynamicFilterResponse;
}
