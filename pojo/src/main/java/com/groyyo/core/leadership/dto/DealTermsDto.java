package com.groyyo.core.leadership.dto;

import com.groyyo.core.base.common.dto.AbstractDto;
import com.groyyo.core.leadership.enums.DealTermStatus;
import com.groyyo.core.legal.enums.DealTermsEnum;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(of="identifier",callSuper = false)
public class DealTermsDto extends AbstractDto{

	private DealTermsEnum identifier;
	
	private String name;
	
	private String value;
	
	private DealTermStatus dealTermStatus;
	
	private Long estateId;
	
}
