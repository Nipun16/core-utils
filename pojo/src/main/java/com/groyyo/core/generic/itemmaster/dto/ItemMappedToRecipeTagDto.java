package com.groyyo.core.generic.itemmaster.dto;

import com.groyyo.core.utilservice.annotations.Range;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author nipunaggarwal
 * 
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemMappedToRecipeTagDto {
    private long itemsMapped;
    private long active;
    private long inactive;
}
