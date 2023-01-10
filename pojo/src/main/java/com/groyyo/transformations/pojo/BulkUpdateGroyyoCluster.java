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
public class BulkUpdateGroyyoCluster {
    List<UpdateGroyyoCityInGroyyoCluster> rows;
    List<UIKeyValue> groyyoCityOptions;
    List<UIKeyValue> zoneOptions;
    UIKeyValue groyyoCity;
    UIKeyValue zone;
}


