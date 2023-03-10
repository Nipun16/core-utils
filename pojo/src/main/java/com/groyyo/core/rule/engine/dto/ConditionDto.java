package com.groyyo.core.rule.engine.dto;

import com.groyyo.core.rule.engine.enums.RuleOperatorEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author nipunaggarwal 
 *
 *
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConditionDto implements Serializable {

	private String leftOperandUuid;
	
	private String leftOperand;

	private RuleOperatorEnum operator;

	private String operatorValue;

	private String rightOperand;
	private String rightOperandUuid;
}