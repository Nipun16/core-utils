/**
 * 
 */
package com.groyyo.core.leadership.dto;

import com.groyyo.core.estate.enums.EstateStatus;
import com.groyyo.core.utilservice.annotations.DateCompare;
import lombok.*;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@Builder
@Data
public class CompetitionStatusFilter {

	private boolean enabled;
	private String displayText;
	private int count;
}
