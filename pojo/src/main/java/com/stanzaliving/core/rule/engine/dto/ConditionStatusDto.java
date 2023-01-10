package com.stanzaliving.core.rule.engine.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal 
 *
 *
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionStatusDto extends ConditionDto {

	private Boolean passed;
}