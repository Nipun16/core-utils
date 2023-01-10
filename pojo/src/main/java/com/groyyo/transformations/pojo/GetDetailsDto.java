package com.groyyo.transformations.pojo;

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
public class GetDetailsDto {

    private CategoryFilter listingsFor;
    private CategoryFilter column;
    private String uuid;
}
