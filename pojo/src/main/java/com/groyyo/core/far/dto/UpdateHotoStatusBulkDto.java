package com.groyyo.core.far.dto;

import com.groyyo.core.far.enums.HotoStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author nipunaggarwal
 *
 */
@Setter
@Getter
public class UpdateHotoStatusBulkDto {
    private List<String> listOfAssets;
    private String addressUuid;
    private HotoStatus hotoStatus;
}
