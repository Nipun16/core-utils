/**
 * 
 */
package com.stanzaliving.transformations.ui.pojo;

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
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Residence {

	private String residenceName;
	
	private Long id;
	
	private String uuid;
}