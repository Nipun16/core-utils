package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetActionType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.HashMap;

/**
 * @author nipunaggarwal
 *
 */

@Getter
@Setter
@Data
public class AssetHistoryDto {
    private String assetUuid;
    private String contextDescription;
    private HashMap<String,String> before;
    private HashMap<String,String> after;
    private Timestamp timestamp;
    private AssetActionType assetActionType;
    private String contextId;
    private String createdBy;
    private String user;
}
