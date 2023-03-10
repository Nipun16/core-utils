/**
 * 
 */
package com.groyyo.core.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.sendgrid.Personalization;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import com.groyyo.core.base.utils.GroyyoUtils;

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
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {

	private String from;
	private String fromName;
	private String[] to;
	private String[] cc;
	private String[] bcc;
	private String subject;
	private String content;
	private String templateId;
	private Map<String, Object> emailData;
	private Map<String, String> attachment;
	private Personalization personalization;
	private List<AttachmentDto> attachments;
	
	public String[] getTo() {
		return removeWhiteSpaces(to);
	}

	public String[] getCc() {
		return removeWhiteSpaces(cc);
	}

	public String[] getBcc() {
		return removeWhiteSpaces(bcc);
	}

	private String[] removeWhiteSpaces(String[] arr) {

		if (ArrayUtils.isNotEmpty(arr)) {
			return Arrays.stream(arr).filter(StringUtils::isNotBlank).map(String::trim).filter(GroyyoUtils::isValidEmail).toArray(String[]::new);
		}

		return new String[] {};
	}

}