package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.generic.dto.UIKeyValue;
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
    List<UIKeyValue> stanzaCity;
    List<UIKeyValue> stanzaCluster;
    List<UIKeyValue> geographicalCluster;
    List<UIKeyValue> residence;
    List<UIKeyValue> geographicalCity;
}
