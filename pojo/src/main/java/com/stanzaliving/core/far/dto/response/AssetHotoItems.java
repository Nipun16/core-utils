package com.stanzaliving.core.far.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author nipunaggarwal
 * 
 */
@Data
@Getter
@Setter
@SuperBuilder
public class AssetHotoItems {
    private String itemCode;
    private String itemName;
    private int countOfAssets ;
    private List<AssetBaseDetails> listOfAssets;
}
