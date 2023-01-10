package com.groyyo.transformations.pojo;

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
public class BulkUpdateRequestDto {
    List<String> data;
}
