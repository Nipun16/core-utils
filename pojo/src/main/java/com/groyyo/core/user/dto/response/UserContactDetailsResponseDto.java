package com.groyyo.core.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

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
@EqualsAndHashCode(of = { "userId" })
public class UserContactDetailsResponseDto implements Serializable {

	private String userId;

	private String email;

	private String mobile;

	private String name;

}