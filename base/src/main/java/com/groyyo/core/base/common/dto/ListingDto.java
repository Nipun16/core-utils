/**
 * 
 */
package com.groyyo.core.base.common.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 * 
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ListingDto implements Serializable {

	private static final long serialVersionUID = 5307953344200311760L;

	private String id;

	private String name;

	public static ListingDto of(String id, String name) {
		return new ListingDto(id, name);
	}
}