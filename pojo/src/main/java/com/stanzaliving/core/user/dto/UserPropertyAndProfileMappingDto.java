/**
 * 
 */
package com.stanzaliving.core.user.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 * 
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserPropertyAndProfileMappingDto extends UserProfileDto {

	private String userId;

	private String propertyId;
	
	private LocalDate arrivalDate;
}