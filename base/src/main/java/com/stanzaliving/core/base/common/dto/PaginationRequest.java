/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * 
 * @author nipunaggarwal
 *
 * 
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PaginationRequest {

	@Builder.Default
	protected int pageNo = 1;

	@Builder.Default
	protected int limit = 100;

}