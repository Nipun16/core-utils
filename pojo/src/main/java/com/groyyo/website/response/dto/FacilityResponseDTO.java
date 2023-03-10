/**
 * @author nipunaggarwal
 *
 */
package com.groyyo.website.response.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacilityResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int facilityId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;
	private String facilityImgUrl;
	private Integer sequenceId;
	private String iconImageUrlAltTag;

}
