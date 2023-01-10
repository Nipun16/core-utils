package com.stanzaliving.transformations.pojo;

import lombok.*;

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
public class TransformationsListingDto {
    private String uuid;
    private String zoneName;

    private String geographicalClusterName;
    private DescriptiveDto geographicalCluster;

    private String stanzaClusterName;
    private DescriptiveDto stanzaCluster;

    private String geographicalCityName;
    private DescriptiveDto geographicalCity;

    private String stanzaCityName;
    private DescriptiveDto stanzaCity;

    private String microMarketName;
    private DescriptiveDto microMarket;

    private DescriptiveDto residences;

    private UpdatedByDto lastUpdated;
    private Boolean enabled;

    private String textColor;
    private String backgroundColor;




}
