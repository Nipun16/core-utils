package com.groyyo.item_master.dtos;

import com.groyyo.core.generic.itemmaster.enums.ItemMetaInfoTypes;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ItemMetaUpdateDto {
    private ItemMetaInfoTypes updateType;
    private ItemMetaDto metaDto;
}
