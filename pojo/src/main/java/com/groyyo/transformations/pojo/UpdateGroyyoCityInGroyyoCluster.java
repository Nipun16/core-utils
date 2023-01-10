package com.groyyo.transformations.pojo;

import com.groyyo.core.generic.dto.UIKeyValue;
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
public class UpdateGroyyoCityInGroyyoCluster {
    private UIKeyValue groyyoCluster;
    private UIKeyValue currentZone;
    private UIKeyValue currentGroyyoCity;

}
