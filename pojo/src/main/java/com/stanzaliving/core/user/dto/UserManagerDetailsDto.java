package com.stanzaliving.core.user.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 *
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
public class UserManagerDetailsDto {

	private String managerId;

	private String firstName;

	private String middleName;

	private String lastName;
}
