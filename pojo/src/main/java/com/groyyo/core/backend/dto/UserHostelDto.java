package com.groyyo.core.backend.dto;

import lombok.*;

/**
 * @author nipunaggarwal 
 *
 * 
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserHostelDto {

	private String userCode;

	private String residenceId;
	
	private Integer hostelId;

	private String hostelName;
}