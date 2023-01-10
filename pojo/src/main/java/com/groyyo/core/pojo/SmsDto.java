/**
 * 
 */
package com.groyyo.core.pojo;

import com.groyyo.core.enums.SmsType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 * 
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SmsDto {

	private SmsType smsType;

	private String isoCode;

	private String mobile;

	private String text;

	private String templateId;

}