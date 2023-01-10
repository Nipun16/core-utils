package com.groyyo.transformations.pojo;

import com.groyyo.core.base.common.dto.PageResponse;
import lombok.*;

import java.util.List;

/**
 * @author nipunaggarwal
 * 
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransformationsListingPagingDto {
    private PageResponse<TransformationsListingDto> data;
    private Long totalPages;
    private Long currentPage;
    private Long totalRecords;
}
