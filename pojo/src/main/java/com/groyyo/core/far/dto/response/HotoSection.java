package com.groyyo.core.far.dto.response;

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
@Setter
@Getter
@SuperBuilder
public class HotoSection {
    private List <AssetHotoItems> groyyoAssets;
    private List <AssetHotoItems> landlordAssets;
    private String message;

}
