/**
 * 
 */
package com.groyyo.designservice.request.dto;

import java.util.List;

import com.groyyo.designservice.response.dto.CivilChangesAttributes;

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
public class CivilChangesRequestDto {

	private String estateUuid;
	private List<CivilChangesAttributes> civilChanges;
}
