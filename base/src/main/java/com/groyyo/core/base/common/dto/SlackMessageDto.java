/**
 * 
 */
package com.groyyo.core.base.common.dto;

import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 * 
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SlackMessageDto {

	private String message;

	private String url;
}