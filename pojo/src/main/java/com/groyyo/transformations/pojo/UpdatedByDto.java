package com.groyyo.transformations.pojo;

import lombok.*;

import java.sql.Timestamp;

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
public class UpdatedByDto {
    private Timestamp time;
    private String doneBy;
}
