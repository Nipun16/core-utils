package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.RejectionType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author nipunaggarwal
 * 
 */
@Data
@Getter
@Setter
public class HotoRejectDto {
    private String rejectionDetails;
    private RejectionType rejectionType;
    private String assetId;
    private String cartUuid;
    private String addressUuid;
}
