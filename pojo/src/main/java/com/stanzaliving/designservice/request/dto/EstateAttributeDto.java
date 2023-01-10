/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class EstateAttributeDto {

	private String estateId;
	private String attributeName;
	private String attributeValue;
}
