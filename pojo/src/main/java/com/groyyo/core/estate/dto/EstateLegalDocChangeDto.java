/**
 * 
 */
package com.groyyo.core.estate.dto;

import com.groyyo.core.estate.enums.EstateLegalDocumentType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EstateLegalDocChangeDto {

	private String estateUuid;
	private EstateLegalDocumentType documentType;
	private String reason;
}
