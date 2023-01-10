package com.groyyo.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedFieldsDto {
    private String oldValue;
    private String newValue;
    private  String contextId;
}
