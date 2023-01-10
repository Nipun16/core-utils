package com.stanzaliving.core.user.request.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal 
 *
 *
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class UserStatusRequestDto {

	private String userId;

	private Boolean status;
}