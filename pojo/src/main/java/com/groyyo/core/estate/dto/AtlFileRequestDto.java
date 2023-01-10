/**
 * 
 */
package com.groyyo.core.estate.dto;

import com.groyyo.core.pojo.AttachmentDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AtlFileRequestDto {

	private String estateUuid;
	private AttachmentDto attachmentDto;
}
