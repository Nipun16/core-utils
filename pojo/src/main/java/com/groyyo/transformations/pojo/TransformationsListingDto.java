package com.groyyo.transformations.pojo;

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

    private String groyyoClusterName;
    private DescriptiveDto groyyoCluster;

    private String geographicalCityName;
    private DescriptiveDto geographicalCity;

    private String groyyoCityName;
    private DescriptiveDto groyyoCity;

    private String microMarketName;
    private DescriptiveDto microMarket;

    private DescriptiveDto residences;

    private UpdatedByDto lastUpdated;
    private Boolean enabled;

    private String textColor;
    private String backgroundColor;




}
