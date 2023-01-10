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
public class EditGroyyoClusterDto {
    private UIKeyValue geographicalCluster;
    private UIKeyValue groyyoCity;
    private UIKeyValue groyyoCluster;
    private List<UIKeyValue> groyyoCityOptions;
    private List<UIKeyValue> groyyoClusterOptions;

}
