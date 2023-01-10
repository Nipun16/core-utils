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
public class GenericGetDto {
    List<UIKeyValue> zone;
    List<UIKeyValue> groyyoCity;
    List<UIKeyValue> groyyoCluster;
    List<UIKeyValue> geographicalCluster;
    List<UIKeyValue> residence;
    List<UIKeyValue> geographicalCity;
}
