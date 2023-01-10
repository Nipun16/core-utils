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
public class DescriptiveDto {
    private List<String> enabled;
    private List<String> disabled;
    private Long count;
}
