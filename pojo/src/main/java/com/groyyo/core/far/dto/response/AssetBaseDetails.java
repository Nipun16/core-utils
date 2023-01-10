package com.groyyo.core.far.dto.response;

import com.groyyo.core.far.enums.RejectionType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 * 
 */
@Getter
@Setter
@SuperBuilder
public class AssetBaseDetails {
    private String qrUrl;
    private String assetUuid;
    private String qrCodeId;
    private String assetCode;
    private String rejectionReason;
    private RejectionType rejectionType;
}
