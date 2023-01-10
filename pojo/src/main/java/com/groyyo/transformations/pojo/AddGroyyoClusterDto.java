package com.groyyo.transformations.pojo;

import com.groyyo.core.generic.dto.UIKeyValue;
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
public class AddGroyyoClusterDto {
    private String groyyoClusterName;
    private UIKeyValue status;
    private UIKeyValue zone;
    private UIKeyValue groyyoCity;
    private List<UIKeyValue> micromarkets;
    private List<UIKeyValue> geographicalCities;

    private List<UIKeyValue> statusOptions;
    private List<UIKeyValue> zoneOptions;
    private List<UIKeyValue> geographicalCityOptions;
    private List<UIKeyValue> groyyoCityOptions;
    private List<UIKeyValue> geographicalClusterOptions;


}
