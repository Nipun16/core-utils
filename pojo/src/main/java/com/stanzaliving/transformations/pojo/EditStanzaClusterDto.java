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
public class EditStanzaClusterDto {
    private UIKeyValue geographicalCluster;
    private UIKeyValue stanzaCity;
    private UIKeyValue stanzaCluster;
    private List<UIKeyValue> stanzaCityOptions;
    private List<UIKeyValue> stanzaClusterOptions;

}
